package com.corenetworks.repasoentidades;

import com.corenetworks.repasoentidades.modelo.Barco;
import com.corenetworks.repasoentidades.modelo.Patron;
import com.corenetworks.repasoentidades.modelo.Salida;
import com.corenetworks.repasoentidades.modelo.Socio;
import com.corenetworks.repasoentidades.servicio.IPatronServicio;
import com.corenetworks.repasoentidades.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RepasoentidadesApplication implements CommandLineRunner {
	@Autowired
	private ISocioServicio servicio;
	@Autowired
	private IPatronServicio servicioPatron;

	public static void main(String[] args) {
		SpringApplication.run(RepasoentidadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Socio s1 = new Socio("12345678Z", "Tita Ruiz", "Torrejon");
		Barco b1 = new Barco("1234ABC", 20, "Titanic", 300);
		Barco b2 = new Barco("4321CBA", 15, "Penelope Cruz", 500);
		b1.setSocio(s1);
		b2.setSocio(s1);
		List<Barco> barcos = new ArrayList<>();
		barcos.add(b1);
		barcos.add(b2);
		s1.setB1(barcos);

		System.out.println("--------INSERTAR DE UNO---------");
		System.out.println(servicio.insertar(s1));

		System.out.println("--------CONSULTA UNO---------");
		System.out.println(servicio.mostrarUno("12345678Z"));

		Patron p1 = new Patron("53824106N","Jairo","Venezuela");
		Salida s2 = new Salida(1, LocalDate.now(), LocalTime.now());
		s2.setPatron(p1);
		Salida s3 = new Salida(1, LocalDate.now(), LocalTime.now());
		s3.setPatron(p1);
		List<Salida> salidas = new ArrayList<>();
		salidas.add(s2);
		salidas.add(s3);
		p1.setS1(salidas);
		System.out.println(servicioPatron.insertar(p1));
	}
}