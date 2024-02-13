package com.corenetworks.Excepciones.controlador;

import com.corenetworks.Excepciones.excepciones.ExcepcionPersonalizadaNoEncontrado;
import com.corenetworks.Excepciones.modelo.Producto;
import com.corenetworks.Excepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    private IProductoServicio servicio;

    @PostMapping
    public ResponseEntity<Producto> insertar(@RequestBody Producto p) throws Exception {//@RequestBody para que lo recoja del body del postman
        Producto p1 = servicio.insertar(p);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);//Recoge lo que se crea en la bbdd
    }

    @PutMapping
    public ResponseEntity<Producto> modificar(@RequestBody Producto p) throws Exception{
        Producto p1 = servicio.listarUno(p.getIdProducto());
        if (p1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Producto no econtrado " + p.getIdProducto());
        }
        return new ResponseEntity<>(p, HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<Producto>> consultarTodos() throws Exception{
        return new ResponseEntity<>(servicio.listarTodos(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> consultarUno(@PathVariable("id") int id) throws Exception{
        Producto p1 = servicio.listarUno(id);
        if (p1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Producto " + id + " no econtrado ");
        }
        return new ResponseEntity<>(p1, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id")int id)throws Exception{
        Producto p1 = servicio.listarUno(id);
        if (p1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Producto " + id + " no econtrado ");
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }

}
