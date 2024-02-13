package com.corenetworks.presetacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ejercicio1Time {
    public static void main(String[] args) {
        //Calcular la edad de una persona que nació el 3 de septiembre 1998
        LocalDate fechaNacimieto = LocalDate.of(1998, Month.SEPTEMBER,3);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimieto,ahora);
        int añosCumplidos = periodo.getYears();
        System.out.println("Tiene " + añosCumplidos + " años");

        //Calcular la fecha de mañana
        LocalDate mañana = LocalDate.now().plusDays(1);
        System.out.println("Mañana es: " + mañana);

        //Restar 3 meses a la fecha de final de curso 22 de marzo de 2024
        LocalDate finalCurso = LocalDate.of(2024,Month.MARCH,22).minusMonths(3);
        System.out.println("La fecha de tres meses antes de que finalice el curso es: " + finalCurso);

        //Calcular los dias desde el inicio del curso
        LocalDate inicioCurso = LocalDate.of(2023,Month.OCTOBER,9);
        Period periodo2 = Period.between(inicioCurso,ahora);
        int mesDeCurso = periodo2.getMonths();
        int diasDeCurso = periodo2.getDays();
        System.out.println("Llevamos " + mesDeCurso + " mes y " + diasDeCurso + " días en el curso");

        //Otra forma
        //Calcular los dias desde el inicio del curso
        Period diasEstudiados = Period.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(diasEstudiados.getDays());
        long diasTranscurridos = ChronoUnit.DAYS.between(LocalDate.of(2023,10,9), LocalDate.now());
        System.out.println("Dias transcurridos "+diasTranscurridos);


        //Duracion del curso
        System.out.println(Period.between(LocalDate.of(2024,3,15),LocalDate.of(2023,10,9)));
    }
}
