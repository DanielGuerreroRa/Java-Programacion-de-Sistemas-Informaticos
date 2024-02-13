package com.corenetworks.ProyectoCapas.servicio;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import com.corenetworks.ProyectoCapas.repositorio.IPedidoRepsitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//"Service para meterlo en el cotenedor
@Service
public class PedidoServicioImpl implements IPedidoServicio{
    //implemetar la interface repositorio y el @Autowriter
    @Autowired
    private IPedidoRepsitorio repositorio;
    @Override
    public Pedido insertar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public Pedido modificar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pedido obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Pedido());
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return repositorio.findAll();
    }
}
