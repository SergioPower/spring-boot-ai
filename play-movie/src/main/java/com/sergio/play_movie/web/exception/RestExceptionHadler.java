package com.sergio.play_movie.web.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sergio.play_movie.domain.exception.MovieAlreadyExistsException;

@RestControllerAdvice
public class RestExceptionHadler {

	@ExceptionHandler(MovieAlreadyExistsException.class)
	public ResponseEntity<Error> handleExeption(MovieAlreadyExistsException ex) {
		Error error = new Error("movie_already_exists", ex.getMessage());
		return ResponseEntity.badRequest().body(error);
	}
}
