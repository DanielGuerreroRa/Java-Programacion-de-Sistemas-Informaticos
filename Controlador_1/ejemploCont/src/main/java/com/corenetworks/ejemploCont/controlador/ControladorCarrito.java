package com.corenetworks.ejemploCont.controlador;

import com.corenetworks.ejemploCont.modelo.Carrito;
import com.corenetworks.ejemploCont.servicio.ICarritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carritos")
public class ControladorCarrito {
    @Autowired
    private ICarritoServicio carritoServicio;
    @PostMapping
    public Carrito insertar(@RequestBody Carrito c){
       return carritoServicio.insertar(c);
    }
    @GetMapping
    public List<Carrito> consultarTodos(){
        return carritoServicio.consultarTodos();
    }
    @GetMapping("{id}")
    public Carrito consultarUno(@PathVariable(name = "id") int id){
        return carritoServicio.consultarUno(id);
    }
    @PutMapping
    public Carrito modificar(@RequestBody Carrito c){
        return carritoServicio.modificar(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name = "id") int id){
        carritoServicio.eliminar(id);
    }



}
