import java.util.Scanner;

public class beecrowd1046 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horaJogo = ler.nextInt();
		int horaFinal = ler.nextInt();
		
		int tempoDuracao = (horaFinal - horaJogo);
		
		if(tempoDuracao <= 0) {
			tempoDuracao += 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", tempoDuracao);
		ler.close();

	}

}
