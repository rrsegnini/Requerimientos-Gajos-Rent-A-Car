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
public class Alquiler {
    private Date fecha;
    private Cliente cliente;
    private Factura factura;
    private Cajero cajero;
    private Automóvil automóvil;

    public Alquiler(Cliente cliente, Cajero cajero, Automóvil automóvil) {
        this.cliente = cliente;
        this.cajero = cajero;
        this.automóvil = automóvil;
    }

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Automóvil getAutomóvil() {
        return automóvil;
    }

    public void setAutomóvil(Automóvil automóvil) {
        this.automóvil = automóvil;
    }
    
    
    
    
    
}
