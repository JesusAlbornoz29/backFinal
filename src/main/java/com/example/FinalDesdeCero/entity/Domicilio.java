package com.example.FinalDesdeCero.entity;
// Implementado DOM, JPA y anotaciones Hibernate


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "Domicilios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Domicilio {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "calle")
    @NotNull ()
    @NotBlank ()
    private String calle;

    @Column (name = "numero")
    @NotNull ()
    @NotBlank ()
    private Integer numero;

    @Column (name = "localidad")
    @NotNull ()
    @NotBlank ()
    private String localidad;

    @Column (name = "provincia")
    @NotNull ()
    @NotBlank ()
    private String provincia;

    /*
    @ManyToOne
    @JoinColumn(name = "paciente_id",nullable = true)  //Consultar si esta bien?
    private Paciente paciente;
    */

    public Domicilio(String calle, Integer numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
