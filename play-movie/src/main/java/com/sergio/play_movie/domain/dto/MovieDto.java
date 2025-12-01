package com.sergio.play_movie.domain.dto;

import java.time.LocalDate;

import com.sergio.play_movie.domain.Genre;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record MovieDto(
		Long id,

		@NotBlank(message = "El título no puede estar vacío") String title,

		@Positive(message = "La duración debe ser un número positivo") Integer duration,

		Genre genre,

		@Past(message = "La fecha de lanzamiento debe ser una fecha pasada") LocalDate realeaseDate,

		@Min(value = 0, message = "La calificación debe ser mayor a 0") @Max(value = 10, message = "La calificación debe ser menor a 10") Double rating,

		Boolean state) {

}
