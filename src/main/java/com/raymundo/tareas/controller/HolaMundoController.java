package com.raymundo.tareas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    @Operation(summary = "Hola", description = "Endpoint de prueba de Hola para probar configuración", responses = {
            @ApiResponse(responseCode = "200", description = "Responde un Hola en JSON", content = @Content(mediaType = "application/json"))
    })
    public ResponseEntity<?> hola() {
        String hola = "Hola";
        return ResponseEntity.ok(hola);
    }

}
