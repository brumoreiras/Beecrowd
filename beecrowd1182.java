import java.util.Scanner;

public class beecrowd1182 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int C = leia.nextInt();
        char T = leia.next().toUpperCase().charAt(0);
        double S = 0;
        int cont = 0;
        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = leia.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            S += m[i][C];
            cont += 1;
        }

        if (T == 'S') {
            System.out.println(String.format("%.1f", S));
        } else if (T == 'M') {
            System.out.println(String.format("%.1f", S / cont));
        }
        leia.close();

    }
}
