/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication129;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Ammar
 */
public class JavaApplication129 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int n1,n2, ans;
     Scanner obj = new Scanner(System.in);
     try{
         System.out.println("Enter First Number:");
         n1 = obj.nextInt();
         System.out.println("Enter Second Number:");
         n2 = obj.nextInt();
         ans = n1/n2;
         System.out.println(n1+"/"+n2+"="+ans);
     }
     catch(ArithmeticException e){
         System.out.println("Cannot Divide Number By Zero");
     }
     catch(InputMismatchException e){
         System.out.println("Input Is Valid, Please Give Integer Number:");
     }
     finally{
         System.out.println("Game Has Been Ended");
     }
    }
    
}

    }
    
}
