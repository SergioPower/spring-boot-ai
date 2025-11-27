package com.sergio.play_movie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sergio.play_movie.persistence.crud.CrudMovieEntity;
import com.sergio.play_movie.persistence.entity.MovieEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MovieController {

	private final CrudMovieEntity crudMovieEntity;

	public MovieController(CrudMovieEntity crudMovieEntity) {
		this.crudMovieEntity = crudMovieEntity;
	}

	@GetMapping("/movies")
	public List<MovieEntity> getAll() {
		return (List<MovieEntity>) this.crudMovieEntity.findAll();
	}

}
