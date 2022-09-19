
package br.com.residencia.poo.aula1;

import java.util.Scanner;

public class ExercicioListaTres {

	public static void main(String[] args) {

		double n1, n2, soma, mult, divi, subt, arit;

		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um sinal aritmético de 1 a 4");
		System.out.println("Digite:");
		System.out.println("1 para ADIÇÃO ");
		System.out.println("2 para SUBTRAÇÃO ");
		System.out.println("3 para MULTIPLICAÇÃO");
		System.out.println("4 para DIVISÃO");
		arit = leia.nextDouble();
		System.out.print("Digite um número:");
		n1 = leia.nextDouble();
		System.out.print("Agora digite outro número:");
		n2 = leia.nextDouble();

		if (arit == 1) {
			soma = n1 + n2;
			System.out.println("O total da conta é:" + soma);
		} else if (arit == 2) {
			subt = n1 - n2;
			System.out.println("O total da conta é:" + subt);
		} else if (arit == 3) {
			mult = n1 * n2;
			System.out.println("O total da conta é:" + mult);
		} else if (arit == 4) {
			divi = n1 / n2;
			System.out.println("O total da conta é:" + divi);
		}

		else {
			System.out.println("Sinal inválido");
		}

		leia.close();

	}
}