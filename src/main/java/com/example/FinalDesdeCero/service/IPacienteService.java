package com.example.FinalDesdeCero.service;


import com.example.FinalDesdeCero.dto.PacienteDTO;
import com.example.FinalDesdeCero.entity.Paciente;
import com.example.FinalDesdeCero.exeption.ResourceNotFoundException;

import java.util.List;
import java.util.Set;

public interface IPacienteService {
    void actualizar (Paciente paciente);

    PacienteDTO buscarPorId(Long id) throws Exception;

    List<PacienteDTO> buscarTodos();

    void guardar(Paciente paciente);

    void eliminar(Long id) throws ResourceNotFoundException;
}
