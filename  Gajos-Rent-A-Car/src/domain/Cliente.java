/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author CASA
 */
public class Cliente extends Usuario{
    private String nombre;
    private String cédula;
    private String dirección;
    private int teléfono;
    private String correo;
    private Automovil auto_alquilado;

    public Cliente(String nombre, String cédula, String dirección, int teléfono, String correo, Automovil auto_alquilado) {
        this.nombre = nombre;
        this.cédula = cédula;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.correo = correo;
        this.auto_alquilado = auto_alquilado;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Automovil getAuto_alquilado() {
        return auto_alquilado;
    }

    public void setAuto_alquilado(Automovil auto_alquilado) {
        this.auto_alquilado = auto_alquilado;
    }
    
    
    
}
