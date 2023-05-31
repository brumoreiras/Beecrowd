import java.util.Scanner;

public class beecrowd1184 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char O = leia.next().toUpperCase().charAt(0);
		double S = 0;
		int cont = 0;
		double[][] m = new double[12][12];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = leia.nextDouble();
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j < i) {
					S += m[i][j];
					cont += 1;
				}
			}
		}

		if (O == 'S') {
			System.out.println(String.format("%.1f", S));
		} else if (O == 'M') {
			System.out.println(String.format("%.1f", S / cont));
		}

		leia.close();

	}

}
