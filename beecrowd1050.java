import java.util.Scanner;

public class beecrowd1050 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] ddd = { 61, 71, 11, 21, 32, 19, 27, 31 };
		String[] destination = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
				"Vitoria", "Belo Horizonte" };
		String achou = "";

		for (int i = 0; i < ddd.length; i++) {
			if (n == ddd[i]) {
				achou = destination[i];
			}
		}

		if (achou != "")
			System.out.println(achou);
		else
			System.out.println("DDD nao cadastrado");
		
		ler.close();
	}
}
