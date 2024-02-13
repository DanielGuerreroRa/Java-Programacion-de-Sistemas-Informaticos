package com.corenetworks.presentacion;

import com.corenetworks.modelo.Shippers;
import com.corenetworks.persistencia.AccesoShippers;

import java.sql.SQLException;

public class ProbarShipper {
    public static void main(String[] args) {
        Shippers s = new Shippers(15,"Nacex","67725363");
        AccesoShippers aS = new AccesoShippers();
        try {
           //System.out.println("Se ha podido añadir el shipper ? " + aS.alta(s));
            //System.out.println("Se ha podiddo modificar el shipper ? " + aS.modificar(s));
            //System.out.println("Se ha podidio eliminar ? " + aS.eliminar(15));
            //System.out.println(aS.consultarUnShipper(1));
            System.out.println(aS.consultarTodosShipper());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
