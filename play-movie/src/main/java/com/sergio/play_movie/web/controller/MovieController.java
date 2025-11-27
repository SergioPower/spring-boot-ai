package com.sergio.play_movie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sergio.play_movie.domain.dto.MovieDto;
import com.sergio.play_movie.domain.dto.UpdateMovieDto;
import com.sergio.play_movie.domain.service.MovieService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/movies")
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping
	public ResponseEntity<List<MovieDto>> getAll() {
		return ResponseEntity.ok(this.movieService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<MovieDto> getById(@PathVariable long id) {
		MovieDto movieDto = this.movieService.getById(id);
		if (movieDto == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(movieDto);
	}

	@PostMapping
	public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.movieService.add(movieDto));
	}

	@PutMapping("/{id}")
	public ResponseEntity<MovieDto> update(@PathVariable long id, @RequestBody UpdateMovieDto updateMovieDto) {
		return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
	}

}
