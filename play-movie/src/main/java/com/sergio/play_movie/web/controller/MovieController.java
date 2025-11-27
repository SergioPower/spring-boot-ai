package com.sergio.play_movie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sergio.play_movie.domain.service.MovieService;

import com.sergio.play_movie.persistence.entity.MovieDto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/movies")
	public List<MovieDto> getAll() {
		return movieService.getAll();
	}

}
