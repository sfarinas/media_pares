package arranjoMediaPares;

import java.util.Scanner;

public class mediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int qtdPar = 0;
		
		System.out.println("Quantos elementos vai ter o seu vetor : ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				qtdPar ++;
				soma += vect[i];
			}
		}
		if (qtdPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = soma / qtdPar;
			System.out.println("MEDIA DOS PARES " + media);
		}
		
		sc.close();
	}
}
