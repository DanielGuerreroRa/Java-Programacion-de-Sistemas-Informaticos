package com.corenetworks.cardenalidadesRepaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroDto {

    private String isbn;
    private String titulo;

}
