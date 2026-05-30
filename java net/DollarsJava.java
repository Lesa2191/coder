/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollars.java;
import java.util.Scanner;
/**
 *
 * @author Kgothatso29
 */
public class DollarsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner work =new Scanner(System.in);
    
   
    System.out.println("enter dollar amount:");
    
    int Amount=work.nextInt();
    final int dollars_in_20=20;
    final int dollars_in_10=10;
    final int dollars_in_5=5;
    final int dollars=1;
    int twenty,ten,five,one;
    twenty=Amount/dollars_in_20;
    ten=Amount/dollars_in_10;
    five=Amount/dollars_in_5;
    one=Amount/dollars;
    
     System.out.println("twenties equal to:"+twenty);
     System.out.println("tens equal to:"+ten);
     System.out.println("fives equal to:"+five);
     System.out.println("ones equal to:"+one);
     
    }
    
}

    
    
    
        
        
        
        
        
        
    

