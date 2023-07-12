package com.example.FinalDesdeCero.service;

import com.example.FinalDesdeCero.dto.TurnoDTO;
import com.example.FinalDesdeCero.entity.Turno;
import com.example.FinalDesdeCero.exeption.ResourceNotFoundException;

import java.util.Collection;
import java.util.List;

public interface ITurnoService {
    Turno actualizar (Turno turno);

    TurnoDTO buscarPorId(Long id) throws Exception;

    List<TurnoDTO> buscarTodos();

    Turno guardar(Turno turno);

    void eliminar(Long id) throws ResourceNotFoundException;

    List<TurnoDTO> buscarPorIdOdontologo(Long idOdontologo);
}
