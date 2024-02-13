package com.corenetworks.MadurezRestfulL.servicio;

import com.corenetworks.MadurezRestfulL.modelo.Medico;
import com.corenetworks.MadurezRestfulL.repositorio.IGenericoRepositorio;
import com.corenetworks.MadurezRestfulL.repositorio.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico,Integer> implements IMedicoServicio {
    @Autowired
    private IMedicoRepositorio repo;

    @Override
    protected IGenericoRepositorio<Medico, Integer> getRepo() {
        return repo;
    }
}
