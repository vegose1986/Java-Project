/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa.universidad;
import com.ucreativa.personas.Profesor;
/**
 *
 * @author verog
 */
public class Carrera {
    
    private String nombre="";
    private Profesor director=new Profesor();
   
    public Carrera(){}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the director
     */
    public Profesor getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(Profesor director) {
        this.director = director;
    }
    
    public String toString(){//revisar
        return nombre +" "+director;
    }
}
