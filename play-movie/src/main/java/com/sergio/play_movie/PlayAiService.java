package com.sergio.play_movie;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestión de Películas Play Movie.
            Usa menos de 120 caracteres y hazlo con el estilo de Netflix.
            """)
    String generateGreeting();
}
