/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileconversion.java;
import java.util.Scanner;
/**
 *
 * @author Kgothatso29
 */
public class MileconversionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner work =new Scanner(System.in);
    
   
    System.out.println("enter number of miles");
    
              
        
      final double INCHES_IN_MILE=63360;
      final double FEET_IN_MILE=5280;
      final double YARDS_IN_MILE=1760;
      final double KILOMETRE_IN_MILE=1.6093441;
      double miles=work.nextInt();
      double in,ft,yds,km;
      in=miles*INCHES_IN_MILE;
      ft=miles*FEET_IN_MILE; 
      yds=miles*YARDS_IN_MILE;
      km=miles*KILOMETRE_IN_MILE;
      System.out.println(miles+"miles");
     System.out.println(in+"inches");
     System.out.println(ft+"feet");
     System.out.println(yds+"yards");
     System.out.println(km+"kilometres");
    }
    
}
