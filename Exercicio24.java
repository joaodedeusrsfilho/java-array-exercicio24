package aula19_Arrays;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		/*
		 * Números palíndromos são aqueles que escritos da direita pra a esquerda têm o
		 * mesmo valor quando escritos da esquerda para a direita. Exemplo: 545, 789987,
		 * 97379, 123454321.
		 * 
		 * Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros
		 * é um palíndromo, ou seja, se o primeiro elemento do vetor é igual ao último,
		 * se o segundo elemento do vetor é igual ao penúltimo e assim por diante até
		 * verificar todos os elementos ou chegar a conclusão que o vetor não é um
		 * palíndromo
		 */

		int[] vetorA = new int[10];
		boolean palindromo = true;
		Scanner ler = new Scanner(System.in);

		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao " + (x + 1));
			vetorA[x] = ler.nextInt();
		}
		for (int x = 0; x < vetorA.length / 2; x++) {
			if (vetorA[x] != vetorA[vetorA.length - 1 - x]) {
				palindromo = false;
				break;// laço for é finalizado
			}
		}
		System.out.println();// saltar uma linha no console
		System.out.println("VetorA = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		if (palindromo) {
			System.out.println("E palindromo");
		} else {
			System.out.println("Nao E palindromo");
		}
	}
}
