import java.util.Scanner;

public class beecrowd2381 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] inputs = leia.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        String[] nomeAluno = new String[n];
        String palavra = "";

        for (int i = 0; i < nomeAluno.length; i++) {
            palavra = leia.next();
            int indice = i;

            if (i == 0) {
                nomeAluno[i] = palavra;
            }

            while (indice > 0 && palavra.compareTo(nomeAluno[indice - 1]) < 0) {
                nomeAluno[indice] = nomeAluno[indice - 1];
                indice--;
            }
            nomeAluno[indice] = palavra;
        }

        System.out.printf("%s\n", nomeAluno[k - 1]);
        leia.close();
    }
}
