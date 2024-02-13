package com.corenetworks.Controlador.repositorio;


import com.corenetworks.Controlador.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepositorio extends JpaRepository<Lugar,Integer> {
}