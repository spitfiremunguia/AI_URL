package com.vorozco.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* App aplicacion = new App();
        List<Integer> numeros3 = aplicacion.generarNumeros();
        System.out.println(numeros3);
        System.out.println(aplicacion.ordernarFuncionalmente(numeros3));*/

        
    }
    
    public List<Integer> generarNumeros(){
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 100_000_000; i++) {
            numeros.add(generador.nextInt(100));
        }
        return numeros;
    }
    
    public List<Integer> bubbleSort(List<Integer> numeros){
        for(int j=0;j<numeros.size();j++){
            for(int i=j+1;i<numeros.size();i++){
                if(numeros.get(i)< numeros.get(j)){
                    Integer t = numeros.get(j);
                    numeros.set( j, numeros.get(i));
                    numeros.set( i, t);
                }
            }
        }
        return numeros;
    }
    
    public List<Integer> ordernarImperativamente(List<Integer> numeros){
        Comparator<Integer> comparador = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(numeros, comparador);
        return numeros;
    }
    
    public List<String> ordernarFuncionalmente(List<Integer> numeros){
        return numeros.stream()
                .filter(x -> x > 50)
                //.sorted((a,b) -> a.compareTo(b))
                .map(x -> "Holi " + x)
                //.peek(x -> System.out.println(x))
                .collect(Collectors.toList());
        
        //numeros.sort((a,b)-> a.compareTo(b));
    }
    
    
    
}
