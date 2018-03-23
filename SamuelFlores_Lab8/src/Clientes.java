
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Clientes {
    private String nombre;
    private String cuenta;
    private String contrasena;
    private ArrayList<Productos> produc = new ArrayList();
    private String numeroidentidad;
    private double saldo;

    public Clientes() {
    }

    public Clientes(String nombre, String cuenta, String contrasena, String numeroidentidad, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.numeroidentidad = numeroidentidad;
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Productos> getProduc() {
        return produc;
    }

    public void setProduc(ArrayList<Productos> produc) {
        this.produc = produc;
    }

    public String getNumeroidentidad() {
        return numeroidentidad;
    }

    public void setNumeroidentidad(String numeroidentidad) {
        this.numeroidentidad = numeroidentidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", produc=" + produc + ", numeroidentidad=" + numeroidentidad + ", saldo=" + saldo + '}';
    }
    
    
    
}
