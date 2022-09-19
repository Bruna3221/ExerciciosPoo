package br.com.residencia.poo.aula1;

import java.util.Scanner;
public class ExercicioListaDois {

	public static void main(String[] args) {
	
		int resultado=0, idade=0;
		
		System.out.println("Bem vindos ao programa: Tempo de vida <3");
		Scanner leia  =  new Scanner(System.in);
	
		 for(int cont = 0; cont <=  5; cont++) {
	    	 System.out.print("Digite tanto a sua idade quanto a de seus colegas (Máx: 6 pessoas): ");
	    	 idade  = leia.nextInt();
	    	 resultado += idade;
		 }
		 System.out.println("O tempo de vida seu e dos seus colegas juntos é de: "+ resultado);{
		 }
		 leia.close();
		 }
	}
	

		
		
		
		
		
		
		
		
		
		
		



