package com.corenetworks.MadurezRestfulL.servicio;

import com.corenetworks.MadurezRestfulL.modelo.Paciente;
import com.corenetworks.MadurezRestfulL.repositorio.IGenericoRepositorio;
import com.corenetworks.MadurezRestfulL.repositorio.IPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicioImpl extends CRUDImpl<Paciente,Integer> implements IPacienteServicio{
    @Autowired
    private IPacienteRepositorio repo;


    @Override
    protected IGenericoRepositorio<Paciente, Integer> getRepo() {
        return repo;
    }
}
