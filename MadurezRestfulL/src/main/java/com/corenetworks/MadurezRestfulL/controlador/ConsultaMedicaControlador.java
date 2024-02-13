package com.corenetworks.MadurezRestfulL.controlador;

import com.corenetworks.MadurezRestfulL.exepciones.ExcepcionNoEncontrado;
import com.corenetworks.MadurezRestfulL.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestfulL.servicio.IConsultaMedicaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaMedicaControlador {
    @Autowired
    private IConsultaMedicaServicio servicio;

    @GetMapping
    public ResponseEntity<List<ConsultaMedica>> consultarTodos() {
        return new ResponseEntity<>(servicio.consultarTodos(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ConsultaMedica> crear(@RequestBody ConsultaMedica cm) {//@RequestBody para que lo recoja del body del postman
        ConsultaMedica cmBBDD = servicio.crear(cm);
        return new ResponseEntity<>(cmBBDD, HttpStatus.CREATED);//Recoge lo que se crea en la bbdd
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaMedica> consultarUno(@PathVariable("id") int id) {
        ConsultaMedica cm = servicio.consultarUno(id);
        if (cm == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ConsultaMedica> modificar(@RequestBody ConsultaMedica cm) {
        ConsultaMedica cmBBDD = servicio.consultarUno(cm.getIdConsulta());
        if (cmBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + cm.getIdConsulta());
        }
        return new ResponseEntity<>(cm,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id")int id){
        ConsultaMedica cmBBDD = servicio.consultarUno(id);
        if (cmBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }
}
