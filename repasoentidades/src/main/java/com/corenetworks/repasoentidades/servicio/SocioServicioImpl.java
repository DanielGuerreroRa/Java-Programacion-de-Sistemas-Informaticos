package com.corenetworks.repasoentidades.servicio;

import com.corenetworks.repasoentidades.modelo.Socio;
import com.corenetworks.repasoentidades.repositorio.ISocioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SocioServicioImpl  implements ISocioServicio{
    @Autowired
    private ISocioRepo repo;
    @Override
    public List<Socio> mostrarTodos() {
        return repo.findAll();
    }

    @Override
    public Socio mostrarUno(String dni) {
        return repo.findById(dni).orElse(new Socio());
    }

    @Override
    public Socio insertar(Socio s1) {
        return repo.save(s1);
    }

    @Override
    public Socio modificar(Socio s1) {
        return repo.save(s1);
    }

    @Override
    public void eliminar(String dni) {
       repo.deleteById(dni);

    }
}
