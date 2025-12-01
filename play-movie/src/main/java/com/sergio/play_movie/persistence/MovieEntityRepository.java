package com.sergio.play_movie.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sergio.play_movie.domain.dto.MovieDto;
import com.sergio.play_movie.domain.dto.UpdateMovieDto;
import com.sergio.play_movie.domain.exception.MovieAlreadyExistsException;
import com.sergio.play_movie.domain.exception.MovieNotFoundException;
import com.sergio.play_movie.domain.repository.MovieRepository;
import com.sergio.play_movie.persistence.crud.CrudMovieEntity;
import com.sergio.play_movie.persistence.entity.MovieEntity;
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

	@Override
	public MovieDto getById(long id) {
		MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
		return this.movieMapper.toDto(movieEntity);
	}

	@Override
	public MovieDto save(MovieDto movieDto) {
		if (this.crudMovieEntity.findFirtByTitulo(movieDto.title()) != null) {
			throw new MovieAlreadyExistsException(movieDto.title());
		}

		MovieEntity movieEntity = this.movieMapper.toEntity(movieDto);
		return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
	}

	@Override
	public MovieDto update(long id, UpdateMovieDto updateMovieDto) {
		MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
		if (movieEntity == null) {
			throw new MovieNotFoundException();
		}
		this.movieMapper.updateEntityFromDto(updateMovieDto, movieEntity);

		return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
	}

	@Override
	public void delete(long id) {
		MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
		if (movieEntity == null) {
			throw new MovieNotFoundException();
		}
		this.crudMovieEntity.deleteById(id);
	}

}
