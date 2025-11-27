package com.sergio.play_movie.domain.dto;

import java.time.LocalDate;

import com.sergio.play_movie.domain.Genre;

public record MovieDto(
		Long id,
		String title,
		Integer duration,
		Genre genre,
		LocalDate realeaseDate,
		Double rating,
		Boolean state) {

}
