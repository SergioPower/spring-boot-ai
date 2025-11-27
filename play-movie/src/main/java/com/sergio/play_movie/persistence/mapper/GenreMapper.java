package com.sergio.play_movie.persistence.mapper;

import org.mapstruct.Named;

import com.sergio.play_movie.domain.Genre;

public class GenreMapper {

	@Named("stringToGenre")
	public static Genre stringToGenre(String genero) {
		if (genero == null)
			return null;

		return switch (genero.toUpperCase()) {
			case "ACCION" -> Genre.ACTION;
			case "COMEDIA" -> Genre.COMEDY;
			case "DRAMA" -> Genre.DRAMA;
			case "ANIMADA" -> Genre.ANIMATED;
			case "TERROR" -> Genre.HORROR;
			case "FAMILIAR" -> Genre.FAMILY;
			case "CIENCIA_FICCION" -> Genre.SCI_FI;
			case "ROMANCE" -> Genre.ROMANCE;
			default -> null;
		};
	}

	@Named("genreToString")
	public static String genreToString(Genre genre) {
		if (genre == null)
			return null;

		return switch (genre) {
			case ACTION -> "ACCION";
			case COMEDY -> "COMEDIA";
			case DRAMA -> "DRAMA";
			case ANIMATED -> "ANIMACION";
			case HORROR -> "TERROR";
			case FAMILY -> "FAMILIAR";
			case SCI_FI -> "CIENCIA_FICCION";
			case ROMANCE -> "ROMANCE";
		};
	}

}
