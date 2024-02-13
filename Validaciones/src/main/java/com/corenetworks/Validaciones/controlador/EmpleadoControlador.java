package com.corenetworks.Validaciones.controlador;

import com.corenetworks.Validaciones.dto.EmpleadoDTO;
import com.corenetworks.Validaciones.dto.ResumenDTO;
import com.corenetworks.Validaciones.excepciones.ExcepcionPersonalizadaNoEncontrado;
import com.corenetworks.Validaciones.modelo.Empleado;
import com.corenetworks.Validaciones.servicio.IEmpleadoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {
    @Autowired
    private IEmpleadoServicio servicio;
    @PostMapping
    public ResponseEntity<EmpleadoDTO> insertar(@Valid @RequestBody EmpleadoDTO e) throws Exception {//@Valid para que active las validaciones de la capa dto
        Empleado e1 = e.castEmpleado();
        e1 = servicio.insertar(e1);
        return new ResponseEntity<>(e.castEmpleadoDto(e1), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<EmpleadoDTO> modificar(@Valid @RequestBody EmpleadoDTO e) throws Exception{
       Empleado e1 = servicio.mostrarUno(e.getIdEmpleado());
        if (e1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado no econtrado " + e.getIdEmpleado());
        }
        e1 =servicio.modificar(e.castEmpleado());
        return new ResponseEntity<>(e.castEmpleadoDto(e1), HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<EmpleadoDTO>> consultarTodos() throws Exception{
        List<Empleado> empleadosBBDD = servicio.mostrarTodos();
        List<EmpleadoDTO> empledosDto = new ArrayList<>();
        for (Empleado elemento : empleadosBBDD){
            empledosDto.add(new EmpleadoDTO().castEmpleadoDto(elemento));
        }
        return new ResponseEntity<>(empledosDto,HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> consultarUno(@PathVariable("id") Integer id) throws Exception{
        Empleado e1 = servicio.mostrarUno(id);
        if (e1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado " + id + " no econtrado ");
        }
        return new ResponseEntity<>((new EmpleadoDTO()).castEmpleadoDto(e1), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id")int id)throws Exception{
        Empleado e1 = servicio.mostrarUno(id);
        if (e1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado " + id + " no econtrado ");
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/resumenes")
    public ResponseEntity<List<ResumenDTO>> obtenerResumen(){
        return new ResponseEntity<>(servicio.obtenerResumenes(),HttpStatus.OK);
    }
}
