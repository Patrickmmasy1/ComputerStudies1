/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional_statement;

import java.util.Scanner;

/**
 *
 * @author hanap
 */
public class Conditional_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operation op=new Operation();
       Scanner sc=new Scanner(System.in);
      
       
         System.out.print("Please Enter number: \n"
        +"1: Summation \n"
        +"2: Difference \n" );
         
         int num;
         num=sc.nextInt();
         
         System.out.print("Please enter the first no:  ");
         op.a=sc.nextInt();
         System.out.print("Please entet the second no:  ");
         op.b=sc.nextInt();
         
         
         switch(num){
             case 1:
                 op.sum();
                 break;
             case 2:
                 op.difference();
                 break;
         }
    }
    
}
