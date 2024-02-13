package com.corenetworks.ProyectoCapas.repositorio;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


//Hacemos es extends JpaRepository sobre Pedido y su id de tipo int
public interface IPedidoRepsitorio extends JpaRepository<Pedido,Integer> {

}
