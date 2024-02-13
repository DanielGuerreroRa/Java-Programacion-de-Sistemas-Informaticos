package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TarjetaCredito {
    private String idTarjeta;
    private String digitosAdicionales;
    private LocalDate fechaVencimiento;
    private double saldo;
    private double saldoRetirar;

    public boolean vCuenta() {
        String formatoPrint = "%-20s %-20s %n";
        LocalDate fechaActual = LocalDate.now();
        boolean cuentaCorrecta = true;
        if (idTarjeta.length() != 15) {
            System.out.printf(formatoPrint, "9137", "Error al validar su cuenta");
            cuentaCorrecta = false;
            return cuentaCorrecta;
        }

        if (fechaVencimiento.isBefore(fechaActual)) {
            System.out.println("La fecha de vencimiento no puede ser inferior a la actual");
            cuentaCorrecta = false;
            return cuentaCorrecta;
        }


        if (digitosAdicionales.length() != 3) {
            System.out.printf("123", "El cliente no está introduciendo el número adicional");
            cuentaCorrecta = false;
            return cuentaCorrecta;
        }

        if(saldoRetirar > saldo){
            System.out.println("No dispone de suficiente saldo" + saldo);
            cuentaCorrecta = false;
        }
        return  cuentaCorrecta;
    }

    public double saldoFinal(){
        return saldo - saldoRetirar;
    }


}