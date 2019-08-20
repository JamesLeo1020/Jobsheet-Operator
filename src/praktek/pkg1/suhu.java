/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkg1;

import java.util.Scanner;

public class suhu {
    
    public static void main(String[] args) {
        //deklarasi
        String strCelcius;
        double celcius, fahrenheit;
        
        // membuat scanner baru
        Scanner cimeng = new Scanner (System.in);
        
        // Input 
        System.out.println("== Program Celcius ke fahrenheit ==");
        System.out.print("Input data celcius: ");
        celcius = cimeng.nextDouble();
        
        // proses
        fahrenheit =((celcius * 1.8) + 32);
        
        // output
        System.out.println("fahrenheit = " + fahrenheit);
        
    }
    
}
