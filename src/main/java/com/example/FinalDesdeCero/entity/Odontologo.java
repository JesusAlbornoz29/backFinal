package com.example.FinalDesdeCero.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

@Entity
@Table(name = "Odontologos")
@Getter
@Setter
@ToString
public class Odontologo {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "matricula")
    private String matricula;

    // Constructor vacio

    public Odontologo() {
    }

    // Constructor sin id

    public Odontologo(String apellido, String nombre, String matricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Construcotr con id


    public Odontologo(Long id, String apellido, String nombre, String matricula) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.matricula = matricula;
    }
}
