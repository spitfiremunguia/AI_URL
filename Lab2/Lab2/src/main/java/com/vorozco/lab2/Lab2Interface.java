/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vorozco.lab2;

import java.util.List;

/**
 *
 * @author tuxtor
 */


public interface Lab2Interface {
    
    /**
     * Cantidad de numeros primos
     * @param listadoNumeros
     * @return 
     */
    public int primos(List<Double> listadoNumeros);
    
    public List<Double> intersection(List<Double> listadoA, List<Double> listadoB);
    
    public List<String> mutate(List<Double> listadoNumeros);
    
    public double sum(List<Double> listadoNumeros);
    
}
