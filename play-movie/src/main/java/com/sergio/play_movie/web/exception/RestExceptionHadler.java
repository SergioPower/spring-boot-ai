package com.sergio.play_movie.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sergio.play_movie.domain.exception.MovieAlreadyExistsException;
import com.sergio.play_movie.domain.exception.MovieNotFoundException;

@RestControllerAdvice
public class RestExceptionHadler {

	@ExceptionHandler(MovieAlreadyExistsException.class)
	public ResponseEntity<Error> handleExeption(MovieAlreadyExistsException ex) {
		Error error = new Error("movie_already_exists", ex.getMessage());
		return ResponseEntity.badRequest().body(error);
	}

	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<Error> handleExeption(MovieNotFoundException ex) {
		Error error = new Error("movie_not_found", ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
