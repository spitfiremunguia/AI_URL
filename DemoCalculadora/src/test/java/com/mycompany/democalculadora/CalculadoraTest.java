/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.democalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class CalculadoraTest {

    CalculadoraBasica calculadora;

    public CalculadoraTest() {
        calculadora = new CalculadoraBasica();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {

        double esperada = 10.0;
        double obtenido = calculadora.sumar(5.0, 5.0);

        assertEquals(esperada, obtenido, 0.0001);

    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        double esperada = 10.0;
        double obtenido = calculadora.restar(20.0, 10.0);

        assertEquals(esperada, obtenido, 0.0001);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        double esperada = 100.0;
        double obtenido = calculadora.multiplicar(20.0, 5.0);

        assertEquals(esperada, obtenido, 0.0001);
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        double esperada = 10.0;
        double obtenido = calculadora.Dividir(20.0, 2.0);

        assertEquals(esperada, obtenido, 0.0001);
    }
    @After
    public void end()
    {
        System.out.println("Adiosito");
    }
    
    @Before
    public void init()
    {
        System.out.println("Holis");
    }

}
