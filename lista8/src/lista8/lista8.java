package lista8;

import java.util.Scanner;

public class lista8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		System.out.println("Diga um número de 1 a 7 que represente um dia da semana:");
		int dia = scanner.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Fim de Semana");
			break;
		case 2:
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útil");
			break;
		case 4:
			System.out.println("Dia útil");
			break;
		case 5:
			System.out.println("Dia útil");
			break;
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Fim de semana");
			break;
			default:
				System.out.println("Dia Inválido");
		}
		
		//2
		
		System.out.println("insira um código de bebida:");
		int bebida = scanner.nextInt();
		switch (bebida) {
		case 1:
			System.out.println("Café - R$5,00");
			break;
		case 2:
			System.out.println("Chá - R$3,50");
			break;
		case 3:
			System.out.println("Suco - R$4,00");
			break;
		case 4:
			System.out.println("Refrigerante - R$4,50");
			break;
			default:
				System.out.println("Código Inválido");
		}
		
		
		//3
		
		System.out.println("Insira um código de veículo:");
		int veiculo = scanner.nextInt();
		switch (veiculo) {
		case 1:
			System.out.println("Carro - Leve");
			break;
		case 2:
			System.out.println("Moto - Motocicleta");
			break;
		case 3:
			System.out.println("Caminhão - Pesado");
			break;
			default:
				System.out.println("Veículo Inválido");
		
		}
		
		//4
		
		System.out.println("Insira um código de plano:");
		int plano = scanner.nextInt();
		switch (plano) {
		case 1:
			System.out.println("Básico - (Acesso limitado)");
			break;
		case 2:
			System.out.println("Intermediário - (Acesso Padrão + Suporte)");
			break;
		case 3:
			System.out.println("Premium - (Acesso total + suporte prioritário)");
			break;
			default:
				System.out.println("Plano Inválido");
		
		}
		
		//5
		
		System.out.println("Insira um número de 1 a 12 que represente uma estação do ano:");
		int estacao = scanner.nextInt();
		switch (estacao) {
		case 1:
			System.out.println("Verão");
			break;
		case 2:
			System.out.println("Verão");
			break;
		case 3:
			System.out.println("Outono");
			break;
		case 4:
			System.out.println("Outono");
			break;
		case 5:
			System.out.println("Outono");
			break;
		case 6:
			System.out.println("Inverno");
			break;
		case 7:
			System.out.println("Inverno");
			break;
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
			System.out.println("Primavera");
			break;
		case 10:
			System.out.println("Primavera");
			break;
		case 11:
			System.out.println("Primavera");
			break;
		case 12:
			System.out.println("Verão");
			break;
			default:
				System.out.println("Mês inválida");
		}
		
		//6
		
		System.out.println("Insira um código de ingresso:");
		int ingresso = scanner.nextInt();
		switch (ingresso) {
		case 1:
			System.out.println("Inteira - (R$50,00)");
			break;
		case 2:
			System.out.println("Meia-estrada - (R$25,00)");
			break;
		case 3:
			System.out.println("VIP - (R$100,00)");
			break;
			default:
				System.out.println("Ingresso Inválido");
		
		}
		
		//7
		
		System.out.println("Insira um código de idioma:");
		int idioma = scanner.nextInt();
		switch (idioma) {
		case 1:
			System.out.println("Português - Olá! ");
			break;
		case 2:
			System.out.println("Inglês - Hello!");
			break;
		case 3:
			System.out.println("Espanhol - ¡Hola!");
			break;
			default:
				System.out.println("Idioma Inválido");
		}
		
		//8
		
		System.out.println("Insira um código de nível:");
		int nivel = scanner.nextInt();
		switch (nivel) {
		case 1:
			System.out.println("Usuário - (Acesso básico)");
			break;
		case 2:
			System.out.println("Moderador - (Acesso Básico + edição)");
			break;
		case 3:
			System.out.println("Administrador - (Acesso total)");
			break;
			default:
				System.out.println("Nível Inválido");
		}
		
		//9
		
		System.out.println("Insira um código de pagamento:");
		int pagamento = scanner.nextInt();
		switch (pagamento) {
		case 1:
			System.out.println("Dinheiro - (Pagamento em dinheiro confirmado)");
			break;
		case 2:
			System.out.println("Cartão - (Pagamento com cartão processado)");
			break;
		case 3:
			System.out.println("Pix - (Pagamento via Pix realizado)");
			break;
			default:
				System.out.println("Plano Inválido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

