package com.corenetworks.ejemploCont.servicio;

import com.corenetworks.ejemploCont.modelo.Carrito;
import com.corenetworks.ejemploCont.repositorio.ICarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServicioImpl implements ICarritoServicio{
    @Autowired
    private ICarritoRepositorio repo;

    @Override
    public Carrito insertar(Carrito c) {
        return repo.save(c);
    }

    @Override
    public Carrito modificar(Carrito c) {
        return repo.save(c);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);

    }

    @Override
    public Carrito consultarUno(int id) {
        return repo.findById(id).orElse(new Carrito());
    }

    @Override
    public List<Carrito> consultarTodos() {
        return repo.findAll();
    }
}
