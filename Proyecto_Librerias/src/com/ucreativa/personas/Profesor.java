/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa.personas;
import com.ucreativa.universidad.Carrera;

/**
 *
 * @author verog
 */
public class Profesor extends Persona {
    private String idEmpleado="";
    private Carrera carreras[]={};  //crear clase carrera
    
    
    public Profesor(){}
    /**
     * @return the idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the carreras
     */
    public Carrera[] getCarreras() {
        return carreras;
    }

    /**
     * @param carreras the carreras to set
     */
    public void setCarreras(Carrera[] carreras) {
        this.carreras = carreras;
    }
    
    public String toString(){//revisar
        return idEmpleado +" "+carreras;
    }
}
