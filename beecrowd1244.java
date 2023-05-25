import java.util.Arrays;
import java.util.Scanner;

public class beecrowd1244 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();

     for (int i = 0; i < n; i++) {
            String[] conjuntoDeStrings = leia.nextLine().split(" ");

            for (int j = 1; j < conjuntoDeStrings.length; j++) {

                int indice = j - 1;
                String palavra = conjuntoDeStrings[j];

                while (indice > 0 && conjuntoDeStrings[indice].length() < palavra.length()) {
                    conjuntoDeStrings[indice + 1] = conjuntoDeStrings[indice];
                    indice--;
                }
                conjuntoDeStrings[indice + 1] = palavra;
                
            }
            System.out.println(Arrays.toString(conjuntoDeStrings));
        }

        leia.close();
    }

}
