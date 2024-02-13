package com.corenetworks.relacionNM;

import com.corenetworks.relacionNM.modelo.Autobus;
import com.corenetworks.relacionNM.modelo.Conductor;
import com.corenetworks.relacionNM.modelo.Lugar;
import com.corenetworks.relacionNM.modelo.Visita;
import com.corenetworks.relacionNM.repositorio.ILugarRepositorio;
import com.corenetworks.relacionNM.servicio.IAutobusServicio;
import com.corenetworks.relacionNM.servicio.ICoductorServicio;
import com.corenetworks.relacionNM.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RelacionNmApplication implements CommandLineRunner {
	@Autowired
	private IAutobusServicio autobusSErvicio;
	@Autowired
	private ICoductorServicio conductorServicio;
	@Autowired
	private ILugarServicio lugarServicio;

	public static void main(String[] args) {
		SpringApplication.run(RelacionNmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Autobus a1 = new Autobus("1234ABC",2022);
		Visita v1 = new Visita(0, LocalDate.now());
		Visita v2 = new Visita(0, LocalDate.now().plusDays(5));
		Lugar l1 = new Lugar(0,"Toledo");
		Conductor c1 = new Conductor("53824106N","Daniel");
		v1.setAutobuses(a1);
		v1.setConductores(c1);
		v1.setLugares(l1);
		v2.setAutobuses(a1);
		v2.setConductores(c1);
		v2.setLugares(l1);
		List<Visita> visitas = new ArrayList<>();
		visitas.add(v1);
		visitas.add(v2);
		a1.setVisitas(visitas);
//		c1.setVisitas(visitas);
//		l1.setVisitas(visitas);
		System.out.println(conductorServicio.insertar(c1));
		System.out.println(lugarServicio.insertar(l1));
		System.out.println(autobusSErvicio.insertar(a1));
	}
}
