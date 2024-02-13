package com.corenetworks.Excepciones.servicio.impl;

import com.corenetworks.Excepciones.repositorio.IGenericoRepositorio;
import com.corenetworks.Excepciones.servicio.ICRUD;

import java.util.List;

//Va a ser una clase abstracta(antes de poner abstract implementar los metodos)  e implementa en ICRUD
public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID> {
    //protected abstract IGenericoRepositorio<T,ID> getRepo();
    protected abstract IGenericoRepositorio<T,ID> getRepo();
    @Override
    public List<T> listarTodos() throws Exception {
        return getRepo().findAll();
    }
    @Override
    public T listarUno(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }
    @Override
    public T insertar(T t) throws Exception {
        return getRepo().save(t);
    }
    @Override
    public T modificar(T t) throws Exception {
        return getRepo().save(t);
    }
    @Override
    public void eliminar(ID id) throws Exception {
        getRepo().deleteById(id);
    }
}
