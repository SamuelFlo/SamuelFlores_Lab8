
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Productos {
    private String nombre;
    private int cantidad;
    private double precio;
    private Date fechacaducidad;

    public Productos() {
    }

    public Productos(String nombre, int cantidad, double precio, Date fechacaducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechacaducidad = fechacaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", fechacaducidad=" + fechacaducidad + '}';
    }
    
    
}
