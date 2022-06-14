/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP;

/**
 *
 * @author SECRETARIA
 */
public class Articulo {
    public int codigo;
    public String nombre;
    public String descripcion;
    public int precioCosto;
    public int precioVenta;
    public String marca; // ver si se hace una clase marca y se pone como tipo marca

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, String descripcion, int precioCosto, int precioVenta, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.marca = marca;
    }

    public Articulo(int codigo, String nombre, int precioVenta, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", marca=" + marca + '}';
    }
    
    
    
    
}
