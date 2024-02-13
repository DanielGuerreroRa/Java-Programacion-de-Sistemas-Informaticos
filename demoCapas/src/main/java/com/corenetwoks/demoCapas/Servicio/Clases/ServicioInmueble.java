package com.corenetwoks.demoCapas.Servicio.Clases;


import com.corenetwoks.demoCapas.Modelo.Inmueble;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoInmueble;
import com.corenetwoks.demoCapas.Servicio.Interfaces.IServivioInmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInmueble implements IServivioInmueble {
    @Autowired
    private IRepoInmueble capaRepo;
    @Override
    public String insertar(Inmueble i) {
        return capaRepo.insertar(i);
    }
}
