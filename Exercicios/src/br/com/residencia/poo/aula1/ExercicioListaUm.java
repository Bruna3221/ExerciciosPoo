package br.com.residencia.poo.aula1;

import java.util.Scanner;
public class ExercicioListaUm {

	public static void main(String[] args) {
		
		 String nome, sobrenome;
		 
		 Scanner leia  =  new Scanner(System.in);
		 System.out.print("Digite seu nome:");
		 nome = leia.next();
		 System.out.print("Agora digite seu sobrenome:");
		 sobrenome= leia.next();
		 System.out.println("Seja bem vindo(a) ao mundo da programação, "+nome+ " "+sobrenome+ " !");
		 
		 leia.close();
		 
		 

	}

}
