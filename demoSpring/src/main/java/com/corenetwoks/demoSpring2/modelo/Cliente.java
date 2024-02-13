package com.corenetwoks.demoSpring2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component //Para meterlo en el contenedor
public class Cliente {
    @Value("123456789A") //Para añadirle valor al atributo
    private String dni;
    @Value("Javier Espinosa")
    private String nombre;
}
