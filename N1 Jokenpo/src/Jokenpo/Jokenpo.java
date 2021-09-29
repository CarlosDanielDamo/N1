package Jokenpo;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador,maquina;
		Scanner teclado = new Scanner(System.in);
		System.out.println("---X1 De JoKenP�---");
		System.out.println("(Regras:Ven�a da Maquina XD)");
		System.out.println("");
		System.out.println("1.Pedra");
		System.out.println("2.Papel");
		System.out.println("3.Tesoura");
		System.out.println("Digite o numero da sua escolha: ");
		
		jogador = teclado.nextInt();
		System.out.println("");
		switch(jogador){
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Ops�o inv�lida");
			break;
		}
		teclado.close();
		
		maquina = (int)(Math.random()*3 + 1);
		switch(maquina){
		case 1:
			System.out.println("A maquina escolheu Pedra");
			break;
		case 2:
			System.out.println("A maquina escolheu Papel");
			break;
		case 3:
			System.out.println("A maquina escolheu Tesoura");
			break;
		}
		System.out.println("");
		if(jogador == maquina) {
			System.out.println("EMPATE");
		} else {
			if((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
				System.out.println("JOGADOR VENCEU");
			}
			else {
				System.out.println("MAQUINA VENCEU");
			}
		}
	}

}
