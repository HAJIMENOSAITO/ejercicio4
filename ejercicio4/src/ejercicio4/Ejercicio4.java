/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Variable1;
        Scanner scan = new Scanner(System.in);
        Variable1 = scan.nextInt();
        int resultado = Variable1 % 2;
        if (resultado == 0){ 
            System.out.println("el resto es igual a 0");
    }else if (resultado != 0){
        System.out.println("el resto es " + resultado) ;
    
    }
        
    }    
}
