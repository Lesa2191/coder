/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutes.java;
import java.util.Scanner;

/**
 *
 * @author Kgothatso29
 */
public class MinutesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner work =new Scanner(System.in);
        System.out.println("enter no of minutes:");
    
      double minutes=work.nextInt();
      final double minutes_in_hours=0.0166667;
       final double minutes_in_days=0.000694444;
       
       double hours, days;
       
       hours=minutes* minutes_in_hours;
       days=minutes* minutes_in_days;
       
       System.out.println("minutes in hours:"+hours);
        System.out.println("minutes in days:"+days);
       
      
        
    
}
}
