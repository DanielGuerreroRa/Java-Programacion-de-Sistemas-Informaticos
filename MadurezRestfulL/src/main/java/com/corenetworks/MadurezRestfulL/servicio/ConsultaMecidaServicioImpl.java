package com.corenetworks.MadurezRestfulL.servicio;

import com.corenetworks.MadurezRestfulL.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestfulL.repositorio.IConsultaMedicaRepositorio;
import com.corenetworks.MadurezRestfulL.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaMecidaServicioImpl extends CRUDImpl<ConsultaMedica,Integer> implements IConsultaMedicaServicio{
    @Autowired
    IConsultaMedicaRepositorio repo;

    @Override
    protected IGenericoRepositorio<ConsultaMedica, Integer> getRepo() {
        return repo;
    }
}
