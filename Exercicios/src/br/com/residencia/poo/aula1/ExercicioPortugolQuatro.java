
	package br.com.residencia.poo.aula1;

	import java.util.Scanner;

	public class ExercicioPortugolQuatro {

		static float totalNotas = 0;
		
		public static void main(String[] args) {
			 Scanner scan  =  new Scanner(System.in);
			 System.out.print("Digite seu nome:");
			 String nome = scan.next();
			
			 System.out.print("Digite sua disciplina:");
			 String disciplina = scan.next();
		
		     for(int cont = 1; cont <=  3; cont++) {
		    	 System.out.print("Digite sua nota: ");
		    	 float nota  = scan.nextFloat();
		    	 totalNotas  += nota;
		     }
		     
			float media =  totalNotas/ 3;{
		     System.out.println("Olá, " +  nome+ "!");
		     System.out.println("Sua média na disciplina "  + disciplina  + " ficou em:  " + media);
		     }
			scan.close();
			}
		
		}
	