package com.mycompany.demoprogramacionfuncional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Instancia de una clase concreta
        Calculadora calc1=new CalculadoraImp();
        //Instancia de clase anonima
        Calculadora calc2=new Calculadora()
        {
          @Override
          public int sumar(int a,int b)
          {
              return a+b;
          }
        };
        //expresar una funcion (Expresion lambda)
        Calculadora calc3=(int a,int b)->
        {
            return a+b;
        };
        //expresion lambda abreviada
        Calculadora calc4=(a,b)->a+b;
        
        double resultado=calc1.sumar(2, 3);;
        resultado=calc2.sumar(2,3);;
        resultado=calc3.sumar(2, 3);
        resultado=calc4.sumar(2, 3);
        
        imprimirSuma(5,6,calc4);
        imprimirSuma(5,6,(a,b)->a+b);
        
        imprimirSuma(5,6,(a,b)->{
        System.out.println("Holis");
        return a+b;});
    }
    //Funcion de tipo High-Order
    public static void imprimirSuma(int a,int b ,Calculadora calc)
    {
        int resultado=calc.sumar(a, b);
        System.out.println(resultado);
    }
}
