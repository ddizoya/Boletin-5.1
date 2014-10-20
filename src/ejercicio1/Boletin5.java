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
public class Boletin5 {

    
    public static void main(String[] args) {
       
    Coche coche = new Coche();
    System.out.println("La velocidad es: " +coche.getVelocidad());
    coche.setAcelerar(40);
    System.out.println("La velocidad es: " +coche.getVelocidad());
    coche.setFrenar(13);
    System.out.println("La velocidad es: " +coche.getVelocidad());
    
    
    }
    
}
