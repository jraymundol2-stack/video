/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtual1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Virtual1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ciclo for
        //se usa caundo se sabe el inicio y al final de las repeticiones
        //ciclo while
        //depende de uan condicion
        //ciclo do-while
        //se va a repetir por lo mneos una vez y de pende de una condicion
        String nombre;
        int edad;
        Scanner lector=new Scanner (System.in);
        for (int i=0;i< 10;i++) {
        System.out.println("ingrese un nombre");
      nombre=lector.next();
            System.out.println("ingrese una edad");
            edad=lector.nextInt();
            if (edad>=18){
                System.out.println("Es mayor de edad");
            }else {
                System.out.println("Es menor de edad");
            }
        }
    }
    
}
