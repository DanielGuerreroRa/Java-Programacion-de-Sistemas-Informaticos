package com.corenetworks.MadurezRestfulL.exepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExepcionPretty {
    private LocalDateTime fecha;
    private String mensaje;
    private String descripcion;

}
