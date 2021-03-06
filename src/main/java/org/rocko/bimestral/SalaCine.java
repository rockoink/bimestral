/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="salaCine")

public class SalaCine {
    
   @Id
   @Column(name ="id_sala")
    private Long idSala;

    @Override
    public String toString() {
        return "SalaCine{" + "idSala=" + idSala + ", tituloPelicula=" + tituloPelicula + ", clasificacion=" + clasificacion + ", numeroAsientos=" + numeroAsientos + '}';
    }
   @Column
    private String tituloPelicula;
   @Column
    private String clasificacion;
   @Column(name="num_asientos")
    private Integer numeroAsientos;

    public SalaCine(String tituloPelicula, String clasificacion, Integer numeroAsientos) {
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.numeroAsientos = numeroAsientos;
    }

    public SalaCine(Long idSala) {
        this.idSala = idSala;
    }

    public SalaCine(Long idSala, String tituloPelicula, String clasificacion, Integer numeroAsientos) {
        this.idSala = idSala;
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.numeroAsientos = numeroAsientos;
    }

    public SalaCine() {
    }

    public Long getIdSala() {
        return idSala;
    }

    public void setIdSala(Long idSala) {
        this.idSala = idSala;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(Integer numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    
   
    
    
    
}
