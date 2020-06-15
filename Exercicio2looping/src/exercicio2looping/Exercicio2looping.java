/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2looping;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio2looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float celsius = entrada.nextFloat();
        float fahrenheit = entrada.nextFloat();
        
        celsius = 10;
        while (celsius <= 100)
        {
            fahrenheit = (((9 * celsius) + 160) / 5);
            System.out.println("%.2fÂ°C = %.2fÂ°F.\n");
		celsius += 10;
        }
    }
    
}
