/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MultiplicationTable {
    
    Scanner input=new Scanner(System.in);




public void printTable(int multiplicationNumber)
{
    System.out.print(" Multiplication Table of   Range From     Range to   product ");

for(int i=0;i<=100;i++){
    if(i>=13&&i<=27){
       int product = multiplicationNumber*i;
    System.out.print("\n     " +multiplicationNumber+"["+i+"]                   "+13+"              "+27+"         "+product);
   
    }
    }

}

    
}
