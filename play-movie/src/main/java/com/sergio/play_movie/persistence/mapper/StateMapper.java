package com.sergio.play_movie.persistence.mapper;

import org.mapstruct.Named;

public class StateMapper {

	@Named("stringToBoolean")
	public static boolean stringToBoolean(String state) {
		if (state == null)
			return false;

		return switch (state.toUpperCase()) {
			case "D" -> true;
			case "N" -> false;
			default -> false;
		};
	}

	@Named("booleanToString")
	public static String booleanToString(Boolean state) {
		return state == null ? "N" : state ? "D" : "N";
	}

}
