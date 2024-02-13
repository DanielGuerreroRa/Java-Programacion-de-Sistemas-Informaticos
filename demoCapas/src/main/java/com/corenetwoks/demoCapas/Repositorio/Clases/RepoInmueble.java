package com.corenetwoks.demoCapas.Repositorio.Clases;

import com.corenetwoks.demoCapas.Modelo.Inmueble;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoInmueble;
import org.springframework.stereotype.Repository;

@Repository
public class RepoInmueble implements IRepoInmueble {
    @Override
    public String insertar(Inmueble i) {
        return String.format("Capa repo %s", i.toString());
    }
}
