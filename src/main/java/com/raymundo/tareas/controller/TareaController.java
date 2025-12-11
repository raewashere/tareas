package com.raymundo.tareas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raymundo.tareas.entity.Tarea;
import com.raymundo.tareas.service.TareaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/tasks")
public class TareaController {
    
    private final TareaService tareaService;

    public TareaController(TareaService TareaService) {
        this.tareaService = TareaService;
    }

    @Operation(
        summary = "Lista de Tareas",
        description = "Regresa los datos de todos los Tareas",
        responses = {
            @ApiResponse(responseCode = "200", description = "Obtiene todos los Tareas", 
                         content = @Content(mediaType = "application/json"))
        }
    )
    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaService.getAllTareas();
    }

    @Operation(
        summary = "Obtiene un Tarea",
        description = "Regresa un Tarea por un id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Obtiene Tarea por id", 
                         content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "No encuentra el Tarea", 
                         content = @Content(mediaType = "application/json"))
        }
    )
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> getTareaById(@PathVariable Long id) {
        return tareaService.getTareaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(
        summary = "Guardar un Tarea",
        description = "Registra un Tarea nuevo",
        responses = {
            @ApiResponse(responseCode = "200", description = "Regresa los datos del Tarea registrado", 
                         content = @Content(mediaType = "application/json"))
        }
    )
    @PostMapping
    public Tarea createTarea(@RequestBody Tarea Tarea) {
        return tareaService.saveTarea(Tarea);
    }

    @Operation(
        summary = "Borrar un Tarea",
        description = "Elimina un Tarea de la lista",
        responses = {
            @ApiResponse(responseCode = "204", description = "No regresa nada", 
                         content = @Content(mediaType = "application/json"))
        }
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarea(@PathVariable Long id) {
        tareaService.deleteTarea(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(
        summary = "Actualiza un Tarea",
        description = "Permite editar un Tarea de la lista",
        responses = {
            @ApiResponse(responseCode = "200", description = "Datos del Tarea actualizado", 
                         content = @Content(mediaType = "application/json"))
        }
    )
    @PutMapping("/{id}")
    public ResponseEntity<Tarea> updateTarea(
            @PathVariable Long id,
            @RequestBody Tarea TareaDetails) {
        Tarea updatedTarea = tareaService.updateTarea(id, TareaDetails);
        return ResponseEntity.ok(updatedTarea);
    }
}
