package com.example.FinalDesdeCero.service;


import com.example.FinalDesdeCero.dto.OdontologoDTO;
import com.example.FinalDesdeCero.entity.Odontologo;
import com.example.FinalDesdeCero.exeption.ResourceNotFoundException;

import java.util.List;
import java.util.Set;

public interface IOdontologoService {
    Odontologo actualizar (Odontologo odontologo);

    OdontologoDTO buscarPorId(Long id) throws Exception;

    List<OdontologoDTO> buscarTodos();

    Odontologo guardar(Odontologo odontologo);

    void eliminar(Long id) throws ResourceNotFoundException;
}
