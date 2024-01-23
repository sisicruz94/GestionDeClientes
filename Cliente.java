/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclientes.dto;

import java.util.Date;


public class Cliente {
    
    private String nombre, apellidos,provincia;
    private Date fechaAlta;

    public Cliente(String nombre, String apellidos, String provincia, Date fechaAlta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getProvincia() {
        return provincia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public String [] toArrayString(){
        String[] s = new String[4];
        s[0]=nombre;
        s[1]=apellidos;
        s[2]=fechaAlta.toString();
        s[3]=provincia;
        return s;
                
    }
    
     
}
