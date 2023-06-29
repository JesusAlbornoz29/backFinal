package com.example.FinalDesdeCero.controller;

import com.example.FinalDesdeCero.entity.OdontologoDTO;
import com.example.FinalDesdeCero.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    //AGREGAR ODONTOLOGO
    @PostMapping ("/")
    public ResponseEntity<String> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        try {
            odontologoService.crearOdontologo(odontologoDTO);
            return ResponseEntity.ok("Odontologo creado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el Odontologo");
        }
    }

    // BUSCARPORID
    @GetMapping("/{id}")
    public OdontologoDTO getOdontologo(@PathVariable Long id) {
        return odontologoService.leerOdontologo(id);
    }

    //MODIFICAR
    @PutMapping ("/modificar")
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        ResponseEntity<String> response = null;
        odontologoService.eliminarOdongologo(id);
        response = ResponseEntity.status(HttpStatus.OK).body("El Odontologo fue eliminado");
        return  ResponseEntity.ok(HttpStatus.OK);
    }

    //GETTODOS
    @GetMapping ("/listar")
    public Collection<OdontologoDTO> listarOdontologos() {
        return odontologoService.getTodos();
    }
}
