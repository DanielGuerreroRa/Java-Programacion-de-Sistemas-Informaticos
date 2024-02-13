package com.corenetworks.ProyectoCapas;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import com.corenetworks.ProyectoCapas.servicio.IPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class ProyectoCapasApplication implements CommandLineRunner {
	@Autowired
	private IPedidoServicio servicio;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido p1 = new Pedido(0, LocalDate.now(),"Efectivo",300);
		System.out.println(servicio.insertar(p1));
		p1.setIdPedido(1);
		p1.setImporte(500);
		//System.out.println(servicio.modificar(p1));
		//servicio.eliminar(1);
		Optional<Pedido> oP1 = Optional.of(new Pedido(5,LocalDate.now(),"Efectivo",100));
		System.out.println("Esta vacio ?" + oP1.isEmpty());
		System.out.println("Existe un objeto? " + oP1.isPresent());
		System.out.println(	"---OBTENER UNO---");
		System.out.println(servicio.obtenerUno(1));
		System.out.println(	"---OBTENER TODOS---");
		System.out.println(servicio.obtenerTodos());

	}
}
