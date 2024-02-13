package com.corenetwoks.demoCapas.Repositorio.Clases;

import com.corenetwoks.demoCapas.Modelo.Factura;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoFactura;
import org.springframework.stereotype.Repository;

@Repository
public class RepoFactura implements IRepoFactura {
    @Override
    public String insertar(Factura f) {
        return String.format("Capa repo simulado BBDD %s", f.toString());
    }
}
