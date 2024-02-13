package com.corenetwoks.demoSpring2;


import com.corenetwoks.demoSpring2.modelo.Cliente;
import com.corenetwoks.demoSpring2.repositorio.Clase.CapaPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpring2Application implements CommandLineRunner { //Llamamos a la implementacion Comm y añadimos metodo run
	@Autowired //Llamamos a los datos guardados en el contenedor
	CapaPersistencia cP1;
	@Autowired
	Cliente c1;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring2Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cP1.insertar(c1));
		System.out.println(cP1.modificar(c1));
		System.out.println(cP1.eliminar(c1));
		System.out.println(cP1.consultar(c1));



	}
}
