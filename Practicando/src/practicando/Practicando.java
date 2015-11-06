/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicando;

import java.util.*;
public class Practicando {

 public static void main(String[] args) 
 {  
      Scanner sc= new Scanner(System.in); 
      //System.out.println("ingrese la primera linea");
      //String linea1=sc.next();
      //System.out.println("ingrese la segunda linea"); 
      //String linea2=sc.next();
      //System.out.println("ingrese la tercera linea"); 
      //String linea3=sc.next();
    String res="";
    String linea1="| -| -| ";
    String linea2=". - . ";
    String linea3="| |_ | ";
    int i=0,j=0,k=0,x=0;
    boolean bb=true;
    while(bb){    
       if(i<=linea1.length()&&j<=linea2.length()&&k<=linea3.length()){   
         String n1= linea(linea1,i);
         String n2= linea(linea2,j);
         String n3= linea(linea3,k);
              
         i=posicion(linea1,i);
         j=posicion(linea2,j);
         k=posicion(linea3,k);
       
         String  nuevo=n1+n2+n3;
         String n=esta(nuevo,numeros());
         res=res+n; 
        }else{
         bb=false;
       }
    }
    System.out.println("resultado: "+res);  
   }
    
 private static String[] numeros()
 {
  String a[]=new String[10];
  a[0]="";
  a[1]="|.|";
  a[2]="-|-|_";
  a[3]="-|-_|";
  a[4]="||-|";
  a[5]="|--_|";
  a[6]="|--|_|";
  a[7]="-|.|";
  a[8]="|-|-|_|";
  a[9]="|-|-_|";
  return a;
 }

 private static String esta(String n,String[] numeros){
    int i=1;
    boolean bb=true;
    String res="";
    while(i<numeros.length&&bb)
    {
     String num=""+numeros[i];    
     if(n.equals(num))
     {
      bb=false;  
      res=res+i; 
     }else{
      i++;  
     }
    }
    return res;
 }
 
 private static String linea(String linea,int i){ 
  String res="";
  boolean bb=true;
  while(bb){
  if(linea.charAt(i)!=' '){
     res=res+linea.charAt(i);
     i++;
  }else{
     bb=false; 
     i++;
  }  
  }
  return res; 
 }

 private static int posicion(String linea,int i){
  boolean bb=true;
  while(bb){
  if(linea.charAt(i)!=' '){
     i++;
  }else{
     bb=false; 
     i++;
  }  
  }
  return i; 
 }  
 }
