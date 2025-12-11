package com.raymundo.tareas.query;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class TareaQuery {

    @PersistenceContext
    private EntityManager entityManager;

}
