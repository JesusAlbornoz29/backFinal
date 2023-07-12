package com.example.FinalDesdeCero.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "Odontologos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Odontologo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    @NotNull()
    @NotBlank()
    private String apellido;

    @Column(name = "nombre")
    @NotNull ()
    @NotBlank ()
    private String nombre;

    @Column(name = "matricula")
    @NotNull ()
    @NotBlank ()
    private String matricula;

    /*
    @OneToMany(mappedBy = "odontologo")
    @JsonIgnore
    private Set<Turno> turnos;
    */

    public Odontologo(String apellido, String nombre, String matricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.matricula = matricula;
    }
}
