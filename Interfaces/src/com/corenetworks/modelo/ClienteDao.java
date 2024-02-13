package com.corenetworks.modelo;

public class ClienteDao {
    //Atributos
    private IDAO conexion;

    //Métodos

    @Override
    public String toString() {
        return "ClienteDao{" +
                "conexion=" + conexion +
                '}';
    }
    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

    //Constructores

    public ClienteDao() {
    }

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }
    //Setters y Getters

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
