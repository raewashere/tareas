package com.raymundo.tareas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.raymundo.tareas.entity.Tarea;
import com.raymundo.tareas.repository.TareaRepository;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    public Optional<Tarea> getTareaById(Long id) {
        return tareaRepository.findById(id);
    }

    public Tarea saveTarea(Tarea Tarea) {
        return tareaRepository.save(Tarea);
    }

    public void deleteTarea(Long id) {
        tareaRepository.deleteById(id);
    }

    public Tarea updateTarea(Long id, Tarea TareaDetails) {
        return tareaRepository.findById(id).map(Tarea -> {
            Tarea.setTitle(TareaDetails.getTitle());
            Tarea.setDescription(TareaDetails.getDescription());
            Tarea.setStatus(TareaDetails.getStatus());
            Tarea.setCreationDate(TareaDetails.getCreationDate());
            return tareaRepository.save(Tarea);
        }).orElseThrow(() -> new IllegalArgumentException("Tarea con ID " + id + " no encontrado."));
    }
}
