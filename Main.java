package com.exersise13;

import java.util.Scanner;


public class Main {

   public static void main(String args[]) {
    
     Scanner in = new Scanner(System.in);

      
      System.out.println( "Введите первую строку: " );
      String s1 = in.nextLine();
      int len1 = s1.length();
      
      
      System.out.println( "Введите вторую строку: " );
      String s2 = in.nextLine();
      int len2 = s2.length();
     
     if (len1 > len2)  {
      System.out.println(s1);
   } else {
     if (len1 < len2)  
      System.out.println(s2);
     else {
       System.out.println("Строки равны");
     }
     

       }
         
     }
 }
