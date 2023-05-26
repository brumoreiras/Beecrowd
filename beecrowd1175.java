import java.util.Scanner;

public class beecrowd1175 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] N = new int[20];
        int[] v = N;
        int[] y = new int[N.length];
        for (int x = 0; x < N.length; x++) {
            N[x] = leia.nextInt();
        }

        for (int i = 0; i < N.length; i++) {
            y[i] = N[N.length - 1 - i];
            y[N.length - 1 - i] = v[i];
            System.out.printf("N[%d] = %d\n", i, y[i]);
        }
        leia.close();

    }
}
