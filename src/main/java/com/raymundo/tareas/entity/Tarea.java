package com.raymundo.tareas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.sql.Date;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
@Table(name = "tarea")
public class Tarea {
    public Tarea() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long Id;

    @Column(name = "Title", nullable = false)
    private String Title;

    @Column(name = "Description", nullable = true)
    private String Description;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", nullable = false)
    private Status Status;

    @Column(name = "CreationDate", nullable= false)
    private Date CreationDate;

}
