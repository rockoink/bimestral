/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

/**
 *
 * @author Sony
 */
public class trabajadorPlanta extends Trabajador implements Nomina {
    
    Float sueldoBase;
    
    @Override
    public String pagarNomina(){
        return("pagado");
    }
    
}
