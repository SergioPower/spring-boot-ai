package com.sergio.play_movie.domain.exception;

public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException() {
		super("La película no fue encontrada.");
	}
}
