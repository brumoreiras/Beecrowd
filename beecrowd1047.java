import java.util.Scanner;

public class beecrowd1047 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horaInicio = ler.nextInt();
		int minutoInicio = ler.nextInt();
		int horaFinal = ler.nextInt();
		int minutoFinal = ler.nextInt();

		int tempoDuracaoHora = horaFinal - horaInicio;
		int tempoDuracaoMinuto = minutoFinal - minutoInicio;

		if ((tempoDuracaoHora <= 0) && (tempoDuracaoMinuto <= 0)) {
			tempoDuracaoHora = 24 + (horaFinal - horaInicio);
		}
		if (tempoDuracaoMinuto < 0) {
			tempoDuracaoMinuto = 60 + (minutoFinal - minutoInicio);
			tempoDuracaoHora--;
		}
		if (horaInicio == horaFinal && minutoInicio == minutoFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempoDuracaoHora, tempoDuracaoMinuto);
		}
		ler.close();
	}

}
