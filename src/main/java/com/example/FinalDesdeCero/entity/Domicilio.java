package com.example.FinalDesdeCero.entity;
// Implementado DOM, JPA y anotaciones Hibernate


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table (name = "Domicilios")
@Getter
@Setter
@ToString
public class Domicilio {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "calle")
    private String calle;
    @Column (name = "numero")
    private Integer numero;
    @Column (name = "localidad")
    private String localidad;
    @Column (name = "provincia")
    private String provincia;
    // Donde iria la bidireccionalidad
    @ManyToOne
    @JoinColumn(name = "paciente_id",nullable = true)  //Consultar si esta bien?
    private Paciente paciente;

    // Constructor Vacio
    public Domicilio() {
    }

    // constructor sin id
    public Domicilio(String calle, Integer numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    // Constructor con id


    public Domicilio(Long id, String calle, Integer numero, String localidad, String provincia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

}
