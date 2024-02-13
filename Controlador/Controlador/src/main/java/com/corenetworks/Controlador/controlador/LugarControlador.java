package com.corenetworks.Controlador.controlador;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")
public class LugarControlador {
    @Autowired
    private ILugarServicio lugarServicio;

    @GetMapping  //Para conectarlo con el @RequestMapping
    public List<Lugar> obtenerTodosLugares(){
        return lugarServicio.mostrarTodos();
    }
    @GetMapping("/{id}")
    public Lugar obtenerUnLugar(@PathVariable("id") int id){//@PathVariable Para ponerle la informacion iguala  @GetMappit
        return lugarServicio.mostrarUno(id);
    }
    @PostMapping
    public Lugar insertarLugar(@RequestBody Lugar l1){ //@RequestBody para recoger la informacion que recojemos desde frot como por ejemplo de un formulario
        return lugarServicio.insertar(l1);
    }
    @PutMapping
    public Lugar modificar(@RequestBody Lugar l1){
        return lugarServicio.modificar(l1);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
         lugarServicio.eliminar(id);
    }



}