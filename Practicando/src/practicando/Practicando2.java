/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

import java.util.Scanner;

/**
 *
 * @author HP-240-G3
 */
public class Practicando2 {
    
static String[] numeros =new String[]{" ","|.|","-|-|_","-|-_|","||-|","|--_|","|--|_|","-|.|","|-|-|_|","|-|-_|"}; 
static String n1,n2,n3,numero;
public static void main (String args[])
{
    numero="";
    Scanner sc = new Scanner(System.in);
    //String linea1=sc.next();
    //String linea2=sc.next();
    //String linea3=sc.next();
    String linea1="| -| -| -|";
    String linea2=". - . -";
    String linea3="| |_ | _|";
    int i=0;
    int j=0;
    int k=0;
    int x=0;
    while(i<linea1.length()&&j<linea2.length()&&k<linea3.length())
    {
     n1=caracter(linea1,i);
     n2=caracter(linea2,j);
     n3=caracter(linea3,k);
     
     i=posicion(linea1,i);
     j=posicion(linea2,j);
     k=posicion(linea3,k);
     
     String res=""+n1+n2+n3;
     x=esIgual(res);
     if(x>0&&x<10){
      numero=numero+x;
     }   
    }
   System.out.println(numero);
}
public static String caracter(String linea,int i)
{
   String res="";
   boolean bb=true;
   while(i<linea.length()&&bb){
      if(linea.charAt(i)!=' '){
        res=res+linea.charAt(i);
        i++;
      }else{
        i++;
        bb=false;  
      }
   }        
   return res;
}

public static int posicion(String linea,int i)
{
   boolean bb=true;
   while(i<linea.length()&&bb){
      if(linea.charAt(i)!=' '){
        i++;
      }else{
        bb=false;  
        i++;
      }
   }        
   return i;
}

public static int esIgual(String res)
{   
   int i=0;
   boolean bb=true;
   while(bb&&i<numeros.length){
    if(res.equals(numeros[i])){
       bb=false; 
    }else{
       i++; 
    } 
   }
   if(bb)
   i=0;
   return i; 
}
    
}
