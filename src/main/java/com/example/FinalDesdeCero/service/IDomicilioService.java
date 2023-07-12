package com.example.FinalDesdeCero.service;

import com.example.FinalDesdeCero.entity.Domicilio;
import com.example.FinalDesdeCero.exeption.ResourceNotFoundException;


import java.util.List;

public interface IDomicilioService {
    void actualizar (Domicilio domicilio);

    Domicilio buscarPorId (Long id);

    List<Domicilio> buscarTodos();

    Long guardar (Domicilio domicilio);

    void eliminar (Long id) throws ResourceNotFoundException;

}
