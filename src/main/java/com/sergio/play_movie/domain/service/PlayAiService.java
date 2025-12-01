package com.sergio.play_movie.domain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlayAiService {

	@UserMessage("""
			Genera un saludo de bienvenida a la plataforma de Gestión de Películas {{plataform}}.
			Usa menos de 120 caracteres y hazlo con el estilo de Netflix.
			""")
	String generateGreeting(@V("plataform") String plataform);

	@SystemMessage("""
			Eres un experto en cine que recomienda películas personalizasas según los gustos del usuario.
			Debes recomendar máximo 3 películas.
			No incluyas películas que estén fuera de la plataforma.
			""")
	String generateMoviesSuggestion(@UserMessage String userMessage);
}
