package com.sergio.play_movie.domain.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public record UpdateMovieDto(
		@NotBlank(message = "El título es obligatorio") String title,

		@PastOrPresent(message = "La fecha de lanzamiento debe ser anterior a la fecha actual") LocalDate realeaseDate,

		@Min(value = 0, message = "La calificación debe ser mayor a 0") @Max(value = 10, message = "La calificación debe ser menor a 10") Double rating) {

}
