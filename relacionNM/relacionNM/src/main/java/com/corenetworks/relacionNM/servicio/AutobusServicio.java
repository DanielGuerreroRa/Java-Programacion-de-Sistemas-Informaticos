package com.corenetworks.relacionNM.servicio;

import com.corenetworks.relacionNM.modelo.Autobus;
import com.corenetworks.relacionNM.modelo.Conductor;
import com.corenetworks.relacionNM.repositorio.IAutobusRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Poner el @Service
@Service

public class AutobusServicio implements IAutobusServicio{
    //Implemetamos IautobusServicio y a sus metodos
    @Autowired
    private IAutobusRepositorio repoAutobus;

    @Override
    public Autobus insertar(Autobus a1) {
        return repoAutobus.save(a1);
    }

    @Override
    public Autobus modificar(Autobus a1) {
        return repoAutobus.save(a1);
    }

    @Override
    public void eliminar(String matricula) {
        repoAutobus.deleteById(matricula);

    }

    @Override
    public List<Autobus> mostrarTodos() {
        return repoAutobus.findAll();
    }

    @Override
    public Autobus mostrarUno(String matricula) {
        return repoAutobus.findById(matricula).orElse(new Autobus());
    }
}
