package com.sergio.play_movie.persistence.crud;

import com.sergio.play_movie.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
}
