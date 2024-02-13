package com.corenetworks.Examen07Feb;

import com.corenetworks.Examen07Feb.modelo.ejercicio1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen07FebApplication implements CommandLineRunner {
	@Autowired
	Factura f1;



	public static void main(String[] args) {
		SpringApplication.run(Examen07FebApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Producto> p1 = new ArrayList<>();
		p1.add(new Producto("Camiseta", 18));
		p1.add(new Producto("Pantalon", 49));




		f1.setProductos(p1);
		System.out.println("IVA General: " + f1.calcularTotalFactura());



	}
}
