package com.example.FinalDesdeCero.dto;

import com.example.FinalDesdeCero.entity.Domicilio;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDTO {
    private Long id;
    private String nombre, apellido, dni, email;
    private Domicilio domicilio;
    private LocalDate fechaDeAlta;

}
