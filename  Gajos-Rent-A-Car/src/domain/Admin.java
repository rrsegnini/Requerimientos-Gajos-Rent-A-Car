/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author CASA
 */
public class Admin {
    private String nombre;
    private Date fecha_creación;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creación() {
        return fecha_creación;
    }

    public void setFecha_creación(Date fecha_creación) {
        this.fecha_creación = fecha_creación;
    }
     
}
