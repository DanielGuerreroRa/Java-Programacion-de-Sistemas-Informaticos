package com.corenetwoks.demoCapas;

import com.corenetwoks.demoCapas.Modelo.Factura;
import com.corenetwoks.demoCapas.Modelo.Inmueble;
import com.corenetwoks.demoCapas.Modelo.Pedido;
import com.corenetwoks.demoCapas.Servicio.Interfaces.IServicioFactura;
import com.corenetwoks.demoCapas.Servicio.Interfaces.IServicioPedido;
import com.corenetwoks.demoCapas.Servicio.Interfaces.IServivioInmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoCapasApplication implements CommandLineRunner {
	@Autowired
	IServicioPedido capaServicioPedido;
	@Autowired
	Pedido p1;

	@Autowired
	IServicioFactura capaServicioFactura;
	@Autowired
	IServivioInmueble capaServicioInmueble;

	public static void main(String[] args) {
		SpringApplication.run(DemoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(capaServicioPedido.insertar(p1));
		Factura f1 = new Factura(1, LocalDate.of(2024,1,18),350);
		System.out.println(capaServicioFactura.insertar(f1));
		Inmueble i1 = new Inmueble("125H34","imagenes/pequeña.jpg","imagenes/grande.jpg","El inmueble ok");
		System.out.println(capaServicioInmueble.insertar(i1));

	}
}
