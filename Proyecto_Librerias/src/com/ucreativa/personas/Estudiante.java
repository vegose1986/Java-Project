/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa.personas;

import com.ucreativa.universidad.Carrera;
import com.ucreativa.universidad.Curso;

/**
 *
 * @author verog
 */
public class Estudiante extends Persona{
    private String carne="";
    private Carrera carreras[]={};
    private Curso cursos[]={}; 

    public Estudiante(){}
    /**
     * @return the carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(String carne) {
        this.carne = carne;
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

    /**
     * @return the cursos
     */
    public Curso[] getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
    
    public String toString(){//revisar
        return carne +" "+carreras+" "+cursos;
    }
    
}
