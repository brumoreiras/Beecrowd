import java.util.Scanner;

public class beecrowd1180 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int[] x = new int[n];
        int menorValor = x[0];
        int posicao = 0;

        for (int entrada = 0; entrada < n; entrada++) {
            x[entrada] = leia.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                menorValor = x[i];
                posicao = i;
            } else if (x[i] < menorValor) {
                menorValor = x[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n", menorValor);
        System.out.printf("Posicao: %d\n", posicao);
        leia.close();
    }
}
