package com.sergio.play_movie.persistence.entity;

import java.time.LocalDate;

import com.sergio.play_movie.domain.Genre;

public record MovieDto(
		String title,
		Integer duration,
		Genre genre,
		LocalDate realeaseDate,
		Double rating,
		Boolean status) {

}
