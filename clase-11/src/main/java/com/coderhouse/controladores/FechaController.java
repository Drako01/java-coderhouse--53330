package com.coderhouse.controladores;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fecha")
public class FechaController {

	private int invocacionesCount = 0;

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
