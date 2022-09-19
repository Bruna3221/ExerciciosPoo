package br.com.residencia.poo.aula1;
     

public class Desafio {

	public static void main(String[] args) {
		int nivel = 6;
		arvoreimpressao(nivel);
	}

	public static void arvoreimpressao(int nivel) {
		for (int linha = 1; linha <= nivel; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) {
				System.out.print("**");
			}
			System.out.println();
		}
		System.out.println("||");
	}}

//Base de um código que vi pela internet, estava anteriormente tentando 
//fazer a árvore com "for" para cada asteristico kkk, não tava indo longe
//assim. Foi bom para estudos e ver que a vida pode ser mais simples, como ce
//mesmo fala: "se ta complicando é porque não é o caminho" (algo assim haha).