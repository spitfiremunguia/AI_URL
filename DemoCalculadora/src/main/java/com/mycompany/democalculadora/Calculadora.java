/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.democalculadora;

/**
 *
 * @author david
 */
public interface Calculadora {

    public Double sumar(Double a, Double b);

    public Double restar(Double a, Double b);

    public Double multiplicar(Double... nums);

    public Double Dividir(Double a, Double b);

}
