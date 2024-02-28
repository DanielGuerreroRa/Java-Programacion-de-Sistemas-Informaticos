package com.corenetworks.cardenalidadesRepaso.controlador;

import com.corenetworks.cardenalidadesRepaso.modelo.Editorial;
import com.corenetworks.cardenalidadesRepaso.servicio.IEditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialServicio editorialServicio;
    //@PostMapping

    //public Editorial crearEditorial(@RequestBody Editorial e1){ //@RequestBody para recoger la informacion que recojemos desde frot como por ejemplo de un formulario
        //return editorialServicio.crear(e1);
   // }
   // @PutMapping

    //public Editorial modificarEditorial(@RequestBody Editorial e1){
     //   return editorialServicio.modificar(e1);
 //   }
    @GetMapping  //Para conectarlo con el @RequestMapping
    public List<Editorial> consultarTodos(){
        return editorialServicio.consultarTodos();
    }
    @RequestMapping("/{id}")
    public Editorial consultarUno(@PathVariable("id") int id){//@PathVariable Para ponerle la informacion iguala  @GetMappit
        return editorialServicio.consultarUno(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarEditorial(@PathVariable("id") int id){
        editorialServicio.eliminar(id);
    }

    //Suponiendo que desde front nos piden una consulta sobre direccion
    //Para filtrar el List por direccion
    @GetMapping("/filtroDireccion/{direccion}")
    public List<Editorial> filtroPorDireccion(@PathVariable(name = "direccion") String direccion){
        return editorialServicio.filtroPorDireccion(direccion);
    }

    //Suponiendo que desde front nos piden una consulta sobre nombre
    //Para filtrar el List por nombre
    @GetMapping("/filtroNombre/{nombre}")
    public List<Editorial> filtroPorNombre(@PathVariable(name = "nombre") String nombre){
        return editorialServicio.filtroPorNombre(nombre);
    }
    //Suponiendo que desde front nos piden una consulta sobre nombre
    //Para filtrar el List por letra del nombre
    @GetMapping("/filtroLetraNombre/{letra}")
    public List<Editorial> filtroPorLetraNombre(@PathVariable(name = "letra") String nombre){
        return editorialServicio.filtroPorNombre(nombre);
    }

}
