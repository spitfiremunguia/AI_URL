/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vorozco.lab2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author david
 */
public class Lab2Imp implements Lab2Interface{
    
  
    
    @Override
    public int primos(List<Double> listadoNumeros) {
        return listadoNumeros.stream()
                .filter(x->(x-x.intValue())==0.0&&x>1)
                .filter(x->IntStream.rangeClosed(2, x.intValue()/2).noneMatch(i->x%i==0)==true)
                
                .collect(Collectors.toList()).size();
               
    }
    
   


    @Override
    public List<Double> intersection(List<Double> listadoA, List<Double> listadoB) {
        return listadoA.stream().filter(x->listadoB.contains(x)).collect(Collectors.toList());
               
    }

    @Override
    public List<String> mutate(List<Double> listadoNumeros) {
        return listadoNumeros.stream()
                .map(x->x.intValue())
                .map(x->x.toString())
                .collect(Collectors.toList());
    }

    @Override
    public double sum(List<Double> listadoNumeros) {
        return listadoNumeros.stream().reduce(0.0, (sum,a)->sum+a);
    }
    
}
