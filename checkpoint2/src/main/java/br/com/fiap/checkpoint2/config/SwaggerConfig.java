package br.com.fiap.checkpoint2.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(
		title = "Checkpoint2", 
		version = "1.0", 
		description = "<table><thead><tr><th>Version</th><th>Author</th><th>Date</th><th>Changes</th></tr></thead><tbody><tr><td>1.0.0</td><td>Luigi Braghittoni</td><td>12-10-2022</td><td>Criação da API Checkpoint 2 - API de pedidos.</td></tr></tbody></table>\n\n\n## Disciplina\n\n Microservice And Web Engineering.\n\n## Professor\n\n Antônio Carlos.\n\n## Aluno\n\n Luigi Gevaerd Braghittoni RM86326."
		)
)
public class SwaggerConfig {

}

