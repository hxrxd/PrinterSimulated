/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stadistic;
import DataLogic.Impresion;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author Usuario
 */
public class Triangular
{
    Impresion i;

    public Triangular(Impresion i) {
        this.i = i;
    }
   
    
    
    public double generar()
    {
        double numero = 0.0;
        double a = i.getMin();
        double b = i.getMedium();
        double c = i.getMax();
        Random r = new Random();
        double x = r.nextDouble();
        if ((x>=0) && (x<((b-a)/(c-a))))
            numero = a + Math.sqrt((b-a)*(c-a)*x);
        else
            numero = c - Math.sqrt((c-b)*(c-a)*(1-x));
        return numero;
    }
    
}
