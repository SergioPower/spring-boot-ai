package com.sergio.play_movie.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sergio.play_movie.persistence.entity.MovieDto;
import com.sergio.play_movie.persistence.entity.MovieEntity;

@Mapper(componentModel = "spring", uses = { GenreMapper.class })
public interface MovieMapper {
	@Mapping(source = "titulo", target = "title")
	@Mapping(source = "duracion", target = "duration")
	@Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
	@Mapping(source = "fechaEstreno", target = "realeaseDate")
	@Mapping(source = "clasificacion", target = "rating")
	MovieDto toDto(MovieEntity entity);

	List<MovieDto> toDto(Iterable<MovieEntity> entities);
}
