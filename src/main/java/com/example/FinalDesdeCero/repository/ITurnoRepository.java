package com.example.FinalDesdeCero.repository;

import com.example.FinalDesdeCero.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITurnoRepository extends JpaRepository<Turno, Long> {
    List<Turno> findByOdontologoId(Long idOdontologo); // Busca y devuelve una lista de turnos basada en el ID del odontólogo
}
