package com.sergio.play_movie.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sergio.play_movie.domain.repository.MovieRepository;
import com.sergio.play_movie.persistence.crud.CrudMovieEntity;
import com.sergio.play_movie.persistence.entity.MovieDto;
import com.sergio.play_movie.persistence.mapper.MovieMapper;

@Repository
public class MovieEntityRepository implements MovieRepository {

	private final CrudMovieEntity crudMovieEntity;
	private final MovieMapper movieMapper;

	public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
		this.crudMovieEntity = crudMovieEntity;
		this.movieMapper = movieMapper;
	}

	@Override
	public List<MovieDto> getAll() {
		return this.movieMapper.toDto(this.crudMovieEntity.findAll());
	}

}
