package pratica;

import java.util.Scanner;

public class Calculadora {
	 
	     public static void main(String[] args){ 
	     int x1, x2, soma, subtração, multiplicação; 
	     float x3, x4, divisão; 
	 
	      Scanner valores; 
	 
	     valores = new Scanner (System.in); 
	     
	     System.out.println("==========CALCULADORA=========="); 
	     System.out.println("Insira o primeiro valor: "); 
	     x1 = valores.nextInt(); 
	     System.out.println("Insira o segundo valor: "); 
	     x2 = valores.nextInt(); 
	 
	      soma = x1 + x2; 
	     subtração = x1 - x2; 
	     multiplicação = x1 * x2; 
	 
	 
	     System.out.println("O resultado da soma é: " + soma); 
	     System.out.println("O resultado da subtração é: " + subtração); 
	     System.out.println("O resultado da multiplicação é: " + multiplicação); 
	 
	     System.out.println("\nInsira o primeiro valor da divisão: "); 
	     x3 = valores.nextInt(); 
	     System.out.println("Insira o segundo valor da divisão: "); 
	     x4 = valores.nextInt(); 
	 
	   divisão = x3 / x4; 
	 
	  System.out.println("O resultado da divisão é: " + divisão); 
	 
	    } 
	} 
