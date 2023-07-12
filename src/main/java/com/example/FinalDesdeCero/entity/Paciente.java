package com.example.FinalDesdeCero.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Pacientes") // Establecemos el nombre de la tabla en la BD
@NoArgsConstructor // Constructor sin parámetros
@AllArgsConstructor // Constructor con todos los parámetros
@Getter // Creamos los Getters y Setters
@Setter // Creamos los Getters y Setters
@ToString // Creamos el método toString
public class Paciente { // Creamos la clase Paciente
    @Id    // Establecemos el Id como Primary Key de tipo indentity
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Establecemos la estrategia de generación de Id
    private Long id; // Creamos el atributo id de tipo Long

    @NotNull // Establecemos que el atributo no puede ser nulo
    @NotBlank // Establecemos que el atributo no puede estar en blanco
    @Column (name ="nombre") // Establecemos el nombre de la columna en la BD
    private String nombre; // Creamos el atributo nombre de tipo String

    @NotNull // Establecemos que el atributo no puede ser nulo
    @NotBlank // Establecemos que el atributo no puede estar en blanco
    @Column(name ="apellido") // Establecemos el nombre de la columna en la BD
    private String apellido; // Creamos el atributo apellido de tipo String

    @NotNull // Establecemos que el atributo no puede ser nulo
    @NotBlank // Establecemos que el atributo no puede estar en blanco
    @Column (name ="dni") // Establecemos el nombre de la columna en la BD
    private String dni; // Creamos el atributo dni de tipo String

    @NotNull()
    @NotBlank()
    private String email;

    @Column (name ="FechaDeAlta") // Establecemos el nombre de la columna en la BD
    private LocalDate fechaDeAlta; // Creamos el atributo fechaDeAlta de tipo Date

    @OneToOne (cascade = CascadeType.REMOVE) // Establecemos la relación con la tabla Domicilio del tipo uno a uno, y definimos como Foreign Key el Id de Domicilio
    @JoinColumn(name = "domicilio_id") // Establecemos el nombre de la columna en la BD
    private Domicilio domicilio; // Creamos el atributo domicilio de tipo Domicilio

    /*
    @OneToMany(mappedBy = "paciente") // Establecemos la relación con la tabla Turno del tipo uno a muchos, y definimos como Foreign Key el Id de Paciente
    @JsonIgnore // Ignoramos el atributo para evitar referencias circulares
    private Set<Turno> turnos; // Creamos el atributo turnos de tipo Set<Turno>
    */

    public Paciente(String nombre, String apellido, String dni, String email, LocalDate fechaDeAlta, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.fechaDeAlta = fechaDeAlta;
        this.domicilio = domicilio;
    }
}
