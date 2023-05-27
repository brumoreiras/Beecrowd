import java.util.Scanner;

public class beecrowd1173 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int V = leia.nextInt();
        int[] N = new int[10];
        int dobro = V;
        for (int i = 0; i < N.length; i++) {
            if (V <= 50) {
                N[0] = dobro;
            }
            N[i] = dobro;
            dobro = dobro + dobro;
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
        leia.close();

    }
}
