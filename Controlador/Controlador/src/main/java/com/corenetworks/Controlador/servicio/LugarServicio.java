package com.corenetworks.Controlador.servicio;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServicio implements ILugarServicio{
    @Autowired
    private ILugarRepositorio repoLugar;

    @Override
    public Lugar insertar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public void eliminar(int idLugar) {
        repoLugar.deleteById(idLugar);

    }

    @Override
    public List<Lugar> mostrarTodos() {
        return repoLugar.findAll();
    }

    @Override
    public Lugar mostrarUno(int idLugar) {
        return repoLugar.findById(idLugar).orElse(new Lugar());
    }
}