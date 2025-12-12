package com.raymundo.tareas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.raymundo.tareas.dto.TareaRequest;
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

    public Optional<Tarea> getTareaById(Integer id) {
        return tareaRepository.findById(id);
    }

    public Tarea saveTarea(TareaRequest tareaRequest) {
        Tarea tarea = new Tarea();
        tarea.setTitle(tareaRequest.getTitle());
        tarea.setDescription(tareaRequest.getDescription());
        tarea.setStatus(tareaRequest.getStatus());
        return tareaRepository.save(tarea);
    }

    public void deleteTarea(Integer id) {
        tareaRepository.deleteById(id);
    }

    public Tarea updateTarea(Integer id, TareaRequest request) {
        Tarea tarea = tareaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        tarea.setTitle(request.getTitle());
        tarea.setDescription(request.getDescription());
        tarea.setStatus(request.getStatus());

        return tareaRepository.save(tarea);
    }
}
