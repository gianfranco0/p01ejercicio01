/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer numero :");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero :");
        int num2 = input.nextInt();
        double producto = input.nextDouble();
        
        for (int i=0; i<=num2; i++){
        producto = producto + num1;
    }
        System.out.println("El producto es: "+producto);
    }
    
}
