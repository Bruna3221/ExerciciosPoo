package br.com.residencia.poo.aula1;


import java.util.Scanner;
public class ExercicioListaQuatro {

	public static void main(String[] args) {
		
		float c, f;
		
		Scanner leia  =  new Scanner(System.in);
		System.out.print("Digite um número de temperatura Celsius e o veja convertido em Fahrenheit:");
		c= leia.nextFloat();
		f=(float) ((c*1.8)+32);
		System.out.println("Fahrenheit:"+f);
		
		leia.close();
		
		
				
				

	}

}
