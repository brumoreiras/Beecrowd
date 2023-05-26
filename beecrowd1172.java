import java.util.Scanner;

public class beecrowd1172 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
		int[] X = new int[10];
		int x = 1;
		for (int i = 0; i < X.length; i++) {
			X[i] = leia.nextInt();
		}
		for (int i = 0; i < X.length; i++) {
			if (X[i] == 0 || X[i] < 0) {
				X[i] = x;
			}
			System.out.printf("X[%d] = %d\n", i, X[i]);
		}
		leia.close();
 
    }
}
