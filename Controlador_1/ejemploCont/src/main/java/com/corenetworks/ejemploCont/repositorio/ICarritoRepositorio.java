package com.corenetworks.ejemploCont.repositorio;

import com.corenetworks.ejemploCont.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoRepositorio extends JpaRepository<Carrito,Integer> {
}
