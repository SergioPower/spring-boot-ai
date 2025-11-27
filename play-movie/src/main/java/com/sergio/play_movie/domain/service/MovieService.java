package com.sergio.play_movie.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sergio.play_movie.domain.repository.MovieRepository;
import com.sergio.play_movie.persistence.entity.MovieDto;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<MovieDto> getAll() {
		return this.movieRepository.getAll();
	}

	public MovieDto getById(long id) {
		return this.movieRepository.getById(id);
	}
}
