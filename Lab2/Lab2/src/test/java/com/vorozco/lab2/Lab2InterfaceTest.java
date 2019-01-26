/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vorozco.lab2;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.collection.IsIterableContainingInOrder;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author tuxtor
 */
public class Lab2InterfaceTest {
    
    
    Lab2Interface lab2Impl=new Lab2Imp();
    
    @Test
    public void testPrimos() {
        List<Double> listadoNumeros = Arrays.asList(1.0,2.0, 3.0, 5.0, 7.0, 11.0
        ,13.0, 15.0, 17.0, 19.0, 20.0, 29.0);
        int primos = lab2Impl.primos(listadoNumeros);
        
        assertEquals(primos, 9);
        
    }

    @Test
    public void testIntersection() {
        
        List<Double> listadoA = Arrays.asList(1.0,2.0, 3.0, 5.0, 7.0, 11.0);
        List<Double> listadoB = Arrays.asList(1.1,2.0, 3.1, 5.0, 7.1, 11.0);
                
        List<Double> resultado = Arrays.asList(2.0, 5.0, 11.0);
        List<Double> obtenido = lab2Impl.intersection(listadoA, listadoB);
        
        assertThat(obtenido, 
        IsIterableContainingInOrder.contains(resultado.toArray()));
    }

    @Test
    public void testMutate() {
        
        List<Double> numeros = Arrays.asList(2.0, 5.0, 11.0);
        
        List<String> resultado = Arrays.asList("2", "5", "11");
        
        assertThat(lab2Impl.mutate(numeros), 
        IsIterableContainingInOrder.contains(resultado.toArray()));
        
    }

    @Test
    public void testSum() {
        double resultado = 18.0;
        List<Double> numeros = Arrays.asList(2.0, 5.0, 11.0);
        
        assertEquals(resultado, lab2Impl.sum(numeros), 0.005);
    }

    
}
