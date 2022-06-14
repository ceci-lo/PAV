/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP;

/**
 *
 * @author SECRETARIA
 */
public class Vendedor extends Persona {
    public long CUIT;
    public int porcentajeComision;

    public Vendedor() {
    }

    public Vendedor(long CUIT, int porcentajeComision) {
        this.CUIT = CUIT;
        this.porcentajeComision = porcentajeComision;
    }

    public Vendedor(long CUIT, int porcentajeComision, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.CUIT = CUIT;
        this.porcentajeComision = porcentajeComision;
    }

    public long getCUIT() {
        return CUIT;
    }

    public void setCUIT(long CUIT) {
        this.CUIT = CUIT;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "CUIT=" + CUIT + ", porcentajeComision=" + porcentajeComision + '}';
    }
    
    
}
