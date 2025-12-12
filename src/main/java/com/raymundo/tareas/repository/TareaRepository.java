package com.raymundo.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raymundo.tareas.entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {

}
