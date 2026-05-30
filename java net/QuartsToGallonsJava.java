/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarts.togallons.java;
import java.util.Scanner;
/**
 *
 * @author TSHEGO
 */
public class QuartsToGallonsJava {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
      
      

        
        final int QUARTS_IN_GALLONS=4;
        int quarts;
        int gallons;
        
        Scanner work =new Scanner(System.in);
        System.out.println("enter the number of quarts you need:");
       quarts= work.nextInt();
       
        int gallonsneeded= quarts/QUARTS_IN_GALLONS;
        int remainquarts= quarts % QUARTS_IN_GALLONS;
        
        
        System.out.println(" gallons needed " + quarts
                + gallonsneeded +remainquarts + quarts);
        
      
        
    }
}

       
        
                
        
        
    
    

