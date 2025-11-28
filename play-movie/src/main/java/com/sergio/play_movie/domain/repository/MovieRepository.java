package com.sergio.play_movie.domain.repository;

import java.util.List;

import com.sergio.play_movie.domain.dto.MovieDto;
import com.sergio.play_movie.domain.dto.UpdateMovieDto;

public interface MovieRepository {
	List<MovieDto> getAll();

	MovieDto getById(long id);

	MovieDto save(MovieDto movieDto);

	MovieDto update(long id, UpdateMovieDto updateMovieDto);

	void delete(long id);
}
