package com.mycompany.democalculadora;



import com.mycompany.democalculadora.Calculadora;
import com.mycompany.democalculadora.Calculadora;
public class CalculadoraBasica implements Calculadora{
    public CalculadoraBasica()
    {
        
    }

    @Override
    public Double sumar(Double a, Double b) {
        return a+b;
 
    }

    @Override
    public Double restar(Double a, Double b) {
        return a-b;

    }

    @Override
    public Double multiplicar(Double... nums) {
        
        double result=1;
        for(int i=0;i<nums.length;i++)
        {
            result*=nums[i];
        }
        return result;
    }

    @Override
    public Double Dividir(Double a, Double b) {
        return a/b;
    
    }
    
}
