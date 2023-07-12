package com.example.FinalDesdeCero.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Turnos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Turno {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull()
    private Paciente paciente;


    @ManyToOne (fetch = FetchType.LAZY) //Muchos turnos pueden tener un mismo odontologo
    @JoinColumn(name = "odontologo_id")
    @NotNull()
    private Odontologo odontologo;

    @Column
    @NotNull()
    private LocalDateTime fecha;

    public Turno(Paciente paciente, Odontologo odontologo, LocalDateTime fecha) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fecha = fecha;
    }
}
