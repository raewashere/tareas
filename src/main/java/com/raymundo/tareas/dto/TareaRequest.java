package com.raymundo.tareas.dto;

import com.raymundo.tareas.entity.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TareaRequest {

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private Status status;
}
