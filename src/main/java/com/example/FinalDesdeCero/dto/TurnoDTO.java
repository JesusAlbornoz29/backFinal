package com.example.FinalDesdeCero.dto;

import com.example.FinalDesdeCero.entity.Odontologo;
import com.example.FinalDesdeCero.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor // Constructor sin parámetros
@JsonIgnoreProperties(ignoreUnknown = true) // Ignora los atributos que no están detallados abajo (El ID)

public class TurnoDTO {
    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDateTime fecha;


}
