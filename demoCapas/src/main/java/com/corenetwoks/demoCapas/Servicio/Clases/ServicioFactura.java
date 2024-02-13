package com.corenetwoks.demoCapas.Servicio.Clases;

import com.corenetwoks.demoCapas.Modelo.Factura;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoFactura;
import com.corenetwoks.demoCapas.Servicio.Interfaces.IServicioFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFactura implements IServicioFactura {
    @Autowired
    private IRepoFactura capaRepo;
    @Override
    public String insertar(Factura f) {
        return capaRepo.insertar(f);
    }
}
