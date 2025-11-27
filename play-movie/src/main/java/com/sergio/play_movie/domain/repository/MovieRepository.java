package com.sergio.play_movie.domain.repository;

import java.util.List;

import com.sergio.play_movie.persistence.entity.MovieDto;

public interface MovieRepository {
	List<MovieDto> getAll();

}
