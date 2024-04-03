package com.coderhouse.controladores;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/fecha")
@Tag(name = "Gestion de Fecha y Hora", description = "Endpoints para Mostrar "
				+ "la Fecha y Hora Actual, y calcular la cantidad de veces que se mostró")
public class FechaController {

	private int invocacionesCount = 0;
	@Operation(summary = "Obtener fecha y hora actual y el número de veces que fue invocada")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Fecha y hora actual, y número de veces invocado"),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String obtenerFechaYHora() {

		invocacionesCount++;

		LocalDateTime fechaActual = LocalDateTime.now();

		String mensaje = "Fecha y Hora Actual: " + fechaActual.toString() + "\n" + "Numero de veces que fue Invocado: "
				+ invocacionesCount;
		;

		return mensaje;
	}

}
