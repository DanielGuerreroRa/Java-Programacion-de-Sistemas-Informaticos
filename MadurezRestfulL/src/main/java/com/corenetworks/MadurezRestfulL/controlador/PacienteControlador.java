package com.corenetworks.MadurezRestfulL.controlador;

import com.corenetworks.MadurezRestfulL.exepciones.ExcepcionNoEncontrado;
import com.corenetworks.MadurezRestfulL.modelo.Paciente;
import com.corenetworks.MadurezRestfulL.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping
    public ResponseEntity<List<Paciente>> consultarTodos() {
        return new ResponseEntity<>(servicio.consultarTodos(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Paciente> crear(@RequestBody Paciente p) {//@RequestBody para que lo recoja del body del postman
        Paciente pBBDD = servicio.crear(p);
        return new ResponseEntity<>(pBBDD, HttpStatus.CREATED);//Recoge lo que se crea en la bbdd
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> consultarUno(@PathVariable("id") int id) {
        Paciente cm = servicio.consultarUno(id);
        if (cm == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Paciente> modificar(@RequestBody Paciente p) {
        Paciente pBBDD = servicio.consultarUno(p.getIdPaciente());
        if (pBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + p.getIdPaciente());
        }
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id")int id){
        Paciente cmBBDD = servicio.consultarUno(id);
        if (cmBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }
}
