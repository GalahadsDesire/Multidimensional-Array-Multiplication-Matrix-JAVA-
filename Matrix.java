/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.Scanner;
/**
 *
 * @author Students Account
 */
public class Matrix {

    public static void main(String[] args) {
        
               int [][] matrices = new int [11] [11];
               
               for (int i = 1 ; i < 11; i++){
                   
                   System.out.println(" ");
                   
                    for (int y = 1; y < 11; y++){
                        
                        
                        
                        matrices [i][y]= i * y;
                        
                        System.out.printf( (y) + "*" + (i) + "= "+ matrices[i][y]+ " ");
                        
                        
                       
                        
                       
                   
               }
                   
                    
               }
               
              
       
        
       
          
            
    }
}
