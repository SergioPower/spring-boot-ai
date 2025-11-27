package com.sergio.play_movie.persistence.entity;

import java.time.LocalDate;

public record MovieDto(
		String title,
		Integer duration,
		String genre,
		LocalDate realeaseDate,
		Double rating) {

}
