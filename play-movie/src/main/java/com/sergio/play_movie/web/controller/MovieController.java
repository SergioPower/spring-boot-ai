package com.sergio.play_movie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sergio.play_movie.domain.service.MovieService;

import com.sergio.play_movie.persistence.entity.MovieDto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/movies")
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping
	public List<MovieDto> getAll() {
		return movieService.getAll();
	}

	@GetMapping("/{id}")
	public MovieDto getById(@PathVariable long id) {
		return this.movieService.getById(id);
	}

}
