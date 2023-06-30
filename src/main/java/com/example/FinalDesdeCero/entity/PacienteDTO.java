package com.example.FinalDesdeCero.entity;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;

// Cambiar id por dni
@Getter
@Setter
public class PacienteDTO {
    private Long id;
    private String apellido;
    private String nombre;
    private Domicilio domicilio;
}
