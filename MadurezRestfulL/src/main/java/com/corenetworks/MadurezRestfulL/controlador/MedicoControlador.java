package com.corenetworks.MadurezRestfulL.controlador;

import com.corenetworks.MadurezRestfulL.exepciones.ExcepcionNoEncontrado;
import com.corenetworks.MadurezRestfulL.modelo.Medico;
import com.corenetworks.MadurezRestfulL.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private IMedicoServicio servicio;

    @GetMapping
    public ResponseEntity<List<Medico>> consultarTodos() {
        return new ResponseEntity<>(servicio.consultarTodos(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Medico> crear(@RequestBody Medico m) {//@RequestBody para que lo recoja del body del postman
        Medico mBBDD = servicio.crear(m);
        return new ResponseEntity<>(mBBDD, HttpStatus.CREATED);//Recoge lo que se crea en la bbdd
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> consultarUno(@PathVariable("id") int id) {
        Medico me = servicio.consultarUno(id);
        if (me == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        return new ResponseEntity<>(me, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Medico> modificar(@RequestBody Medico m) {
        Medico mBBDD = servicio.consultarUno(m.getIdMedico());
        if (mBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + m.getIdMedico());
        }
        return new ResponseEntity<>(m,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id")int id){
        Medico mBBDD = servicio.consultarUno(id);
        if (mBBDD == null) {
            throw new ExcepcionNoEncontrado("Recurso no econtrado " + id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }
}
