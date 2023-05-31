
import java.util.Scanner;

public class beecrowd1051 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario = ler.nextDouble();
		double imposto = 0;
		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario <= 3000) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f\n", imposto);
		} else if (salario <= 4500) {
			 imposto = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);
			 System.out.printf("R$ %.2f\n", imposto);
		} else {
			imposto = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
			System.out.printf("R$ %.2f\n", imposto);
		}
	

		ler.close();

	}

}
