package br.com.residencia.poo.aula1;
import java.util.Scanner;
public class ExercicioListaCinco {

	public static void main(String[] args) {
		
		String operacao,a = null,b= null;
		
		Scanner leia  =  new Scanner(System.in);
		System.out.println("O programa Riuju lhe traz o resultado das seguintes operações:");
		System.out.println("Escolha uma das duas opções:");
		System.out.println("Operação a: 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66 ");
		System.out.println("Operação b:2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
		operacao= leia.next();
		
		if(operacao==a);{
		System.out.println("O resultado da expressão é 256.");
		}
		
		if(operacao==b);{
			System.out.println("O resultado da expressão é 2421.");
		}
		
		leia.close();
		
	}

}
