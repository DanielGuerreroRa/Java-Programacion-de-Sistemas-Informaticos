package com.corenetworks.relacionNM.repositorio;


import com.corenetworks.relacionNM.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepositorio extends JpaRepository<Lugar,Integer> {
}
