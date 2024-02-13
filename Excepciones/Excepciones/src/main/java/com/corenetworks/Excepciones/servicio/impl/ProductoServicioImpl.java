package com.corenetworks.Excepciones.servicio.impl;

import com.corenetworks.Excepciones.modelo.Producto;
import com.corenetworks.Excepciones.repositorio.IGenericoRepositorio;
import com.corenetworks.Excepciones.repositorio.IProductoRepositorio;
import com.corenetworks.Excepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioImpl extends CRUDImpl<Producto,Integer> implements IProductoServicio {
    @Autowired
    private IProductoRepositorio repo;
    @Override
    protected IGenericoRepositorio<Producto, Integer> getRepo() {
        return repo;
    }
}
