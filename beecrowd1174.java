import java.util.Scanner;

public class beecrowd1174 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
		double[] A = new double[100];
		for (int x = 0; x < A.length; x++) {
			A[x] = leia.nextDouble();
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, A[i]);
			}
		}
			leia.close();
 
    }
}
