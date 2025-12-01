package com.sergio.play_movie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sergio.play_movie.domain.dto.MovieDto;
import com.sergio.play_movie.domain.dto.SuggestRequestDto;
import com.sergio.play_movie.domain.dto.UpdateMovieDto;
import com.sergio.play_movie.domain.service.MovieService;
import com.sergio.play_movie.domain.service.PlayAiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movie", description = "Operaciones relacionadas con las películas")
public class MovieController {

	private final MovieService movieService;

	private final PlayAiService aiService;

	public MovieController(MovieService movieService, PlayAiService aiService) {
		this.movieService = movieService;
		this.aiService = aiService;
	}

	@GetMapping
	public ResponseEntity<List<MovieDto>> getAll() {
		return ResponseEntity.ok(this.movieService.getAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Obtener película por ID", description = "Reporna una película según su ID proporcionado", responses = {
			@ApiResponse(responseCode = "200", description = "Película encontrada"),
			@ApiResponse(responseCode = "404", description = "Película no encontrada", content = @Content)
	})
	public ResponseEntity<MovieDto> getById(
			@Parameter(description = "Identificador de la película a recuperar", example = "9") @PathVariable long id) {
		MovieDto movieDto = this.movieService.getById(id);
		if (movieDto == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(movieDto);
	}

	@PostMapping("/suggest")
	public ResponseEntity<String> generateMoviesSuggestion(@RequestBody SuggestRequestDto suggestRequestDto) {
		return ResponseEntity.ok(this.aiService.generateMoviesSuggestion(suggestRequestDto.userPreferences()));
	}

	@PostMapping
	public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.movieService.add(movieDto));
	}

	@PutMapping("/{id}")
	public ResponseEntity<MovieDto> update(@PathVariable long id, @RequestBody @Valid UpdateMovieDto updateMovieDto) {
		return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable long id) {
		this.movieService.delete(id);
		return ResponseEntity.ok().build();
	}

}
