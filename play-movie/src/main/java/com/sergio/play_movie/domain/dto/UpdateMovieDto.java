package com.sergio.play_movie.domain.dto;

import java.time.LocalDate;

public record UpdateMovieDto(
		String title,
		LocalDate realeaseDate,
		Double rating) {

}
