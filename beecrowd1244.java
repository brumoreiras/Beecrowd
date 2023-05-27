import java.util.Scanner;

public class beecrowd1244 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = Integer.parseInt(leia.nextLine());

        for (int q = 0; q < n; q++) {
            String[] conjuntoDeStrings = leia.nextLine().split(" ");

            for (int i = 0; i < conjuntoDeStrings.length - 1; i++) {
                for (int j = 0; j < conjuntoDeStrings.length - i - 1; j++) {
                    if (conjuntoDeStrings[j].length() < conjuntoDeStrings[j + 1].length()) {
                        String aux = conjuntoDeStrings[j];
                        conjuntoDeStrings[j] = conjuntoDeStrings[j + 1];
                        conjuntoDeStrings[j + 1] = aux;
                    }
                }
            }

            for (int i = 0; i < conjuntoDeStrings.length; i++) {
                System.out.print(conjuntoDeStrings[i]);
                if (i < conjuntoDeStrings.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        leia.close();

    }
}
