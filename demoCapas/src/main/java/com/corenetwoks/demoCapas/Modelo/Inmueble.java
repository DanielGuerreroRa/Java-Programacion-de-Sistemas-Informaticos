package com.corenetwoks.demoCapas.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//No va atener @Component porque os llegara la informacion desde Angular
public class Inmueble {

    private String referencia;
    private String rutaFotopequena;
    private String rutaFotoGrande;
    private String descripcion;

}
