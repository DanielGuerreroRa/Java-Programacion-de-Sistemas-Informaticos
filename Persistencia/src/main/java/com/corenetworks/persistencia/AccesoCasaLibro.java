package com.corenetworks.persistencia;

import com.corenetworks.modelo.Autor;

import com.corenetworks.modelo.Libro;
import com.corenetworks.modelo.Tienda;


import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoCasaLibro extends Conexion{

    public List<Libro> obtenerLibrosPorAutor(String dni) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        List<Libro> resultado = new ArrayList<>();
        ResultSet rejilla;
        String sql = "Select la.isbn, titulo, la.dni from libros l inner join libros_autores la on l.isbn = la.isbn where la.dni = ?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1,dni);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        while (rejilla.next()){
            resultado.add(new Libro(
                    rejilla.getString("isbn"),
                    rejilla.getString("titulo")
            ));
        }
        //5. Devolver el resultado
        return resultado;
    }

    public Autor obtenerUnAutor(String dni) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        Autor resultado = null;
        ResultSet rejilla;
        String sql = "Select nombre from autores where dni=?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1,dni);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        if (rejilla.next()){
            resultado=new Autor(
                    dni,
                    rejilla.getString("nombre")
            );
        }
        //5. Devolver el resultado
        return resultado;
    }

    public boolean insertarTienda(Tienda t) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;


        String sql = "Insert into tiendas (direccion_id, ventas) values (?,?);";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1,t.getDireccion());
        sentencia.setBigDecimal(2,t.getVentas());
        //4. Insertar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado>0;
    }

    public Tienda obtenerUnaTienda(int id) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        Tienda resultado = null;
        ResultSet rejilla;
        String sql = "Select direccion_id, ventas from tiendas where tienda_id=?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1,id);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        if (rejilla.next()){
            String valorMoney = rejilla.getString("ventas");
            System.out.println(valorMoney);
            // Realizar ajustes al formato, por ejemplo, quitar el símbolo de euro y el separador de miles
            valorMoney = valorMoney.replace("€", "").replace(".", "").replace(",",".");
            System.out.println(valorMoney);
            Double venta = Double.parseDouble(valorMoney);
            // Convertir a BigDecimal
            BigDecimal ventas = new BigDecimal(venta);
            resultado=new Tienda(
                    id,
                    rejilla.getString("direccion_id"),
                   ventas
            );
        }
        //5. Devolver el resultado
        return resultado;
    }

}
