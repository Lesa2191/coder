/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election.java;
import java.util.Scanner;

/**
 *
 * @author Kgothatso29
 */
public class ElectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner work =new Scanner(System.in);
        System.out.println("input no. of vote EFF: ");
        double voteEFF=work.nextDouble();
        
        System.out.println("input no. of vote DA: ");
        double voteDA=work.nextDouble();
        
        System.out.println("input no. of vote ANC: ");
        double voteANC=work.nextDouble();
        
        String DA,ANC,EFF;
        
        
        
        double total=voteEFF+voteDA+voteANC;
        double a=voteEFF/total;
        double b=voteDA/total;
        double c=voteANC/total;
        double d=a*100;
        double e=b*100;
        double f=c*100;
        
        
        
      System.out.println("EFF:"+d+"%");  
      System.out.println("DA:"+e+"%");  
      System.out.println("ANC:"+f+"%");  
        
        
        
        
    }
    
}
