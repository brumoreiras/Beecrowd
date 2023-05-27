import java.util.Scanner;

public class beecrowd1179 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] impar = new int[5];
        int[] par = new int[5];
        int pos1 = 0;
        int pos2 = 0;
        int valor;
        for (int v = 0; v < 15; v++) {
            valor = leia.nextInt();
            if (valor % 2 == 0) {
                par[pos2] = valor;
                pos2 += 1;
            } else {
                impar[pos1] = valor;
                pos1 += 1;
            }
            if (pos1 == impar.length) {
                pos1 = 0;
                for (int i = 0; i < impar.length; i++) {
                    System.out.printf("impar[%d] = %d\n", i, impar[i]);
                }
            } else if (pos2 == par.length) {
                pos2 = 0;
                for (int i = 0; i < par.length; i++) {
                    System.out.printf("par[%d] = %d\n", i, par[i]);
                }

            }
        }
        for (int i = 0; i < pos1; i++) {
            System.out.printf("impar[%d] = %d\n", i, impar[i]);
        }
        for (int i = 0; i < pos2; i++) {
            System.out.printf("par[%d] = %d\n", i, par[i]);
        }
        leia.close();
    }
}
