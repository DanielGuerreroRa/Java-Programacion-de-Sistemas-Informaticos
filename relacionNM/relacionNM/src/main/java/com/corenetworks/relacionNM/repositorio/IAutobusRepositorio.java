package com.corenetworks.relacionNM.repositorio;

import com.corenetworks.relacionNM.modelo.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;
//Extends con JpaRepository y despues de crear la capa servicio instaciamos IAutobusRepositorio con su valor de la id
public interface IAutobusRepositorio extends JpaRepository<Autobus,String> {
}
