package com.example.FinalDesdeCero.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Pacientes")
@Getter
@Setter
@ToString
public class Paciente {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name ="apellido")
    private String apellido;
    @Column (name ="nombre")
    private String nombre;
    @OneToMany (mappedBy = "paciente")
    @JsonIgnore
    private Set<Domicilio> domicilio; //Consultar si esta bien?
    @Column (name ="dni")
    private String dni;
    @Column (name ="FechaDeAlta")
    private Date fechaDeAlta;

    //Constructor vacio

    public Paciente() {
    }


    // Constructor sin id
    public Paciente(String apellido, String nombre, Set<Domicilio> domicilio, String dni, Date fechaDeAlta) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaDeAlta = fechaDeAlta;
    }

    // Constructor con id
    public Paciente(Long id, String apellido, String nombre, Set<Domicilio> domicilio, String dni, Date fechaDeAlta) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaDeAlta = fechaDeAlta;
    }
}
