import java.util.Scanner;

public class beecrowd1064 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int numeroPositivos = 0;
		double soma = 0;
		double media = 0;
		double numeroEntrada = 0;

		while (n < 6) {
			numeroEntrada = leia.nextDouble();
			if (numeroEntrada > 0) {
				soma += numeroEntrada;
				numeroPositivos++;
			}
			n++;
		} 

		media = soma / numeroPositivos;

		System.out.printf("%d valores positivos\n", numeroPositivos);
		System.out.printf("%.1f", media);

		leia.close();

	}

}
