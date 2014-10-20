/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ddizoya
 */
public class Coche {
    private int velocidad;
    
    public Coche (){ 
        velocidad = 0;
    }
       
    public int getVelocidad(){
        return velocidad;
    }
    public void setAcelerar(int valor){
        velocidad = velocidad + valor;
    }
    public void setFrenar (int valor){
        velocidad = velocidad - valor;
    }
    
    
}
