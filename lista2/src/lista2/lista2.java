package lista2;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//1
		
		double num1;
		double num2;
		System.out.println("Escolha um número que não seja zero: ");
		num1 = scanner.nextDouble();
		System.out.println("Escolha outro número que não seja zero: ");
		num2 = scanner.nextDouble();
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		System.out.println(" A soma entre eles é: " + soma + "A Subtração entre eles é: " + sub + "A multiplicação entre eles é de: " + mult + "A divisão entre eles é de: " + div);
		
		//2
		
		double graus;
		System.out.println("Informe uma temperatura em celsius: ");
		graus = scanner.nextDouble();
		double calculo = graus * 1.8 + 32;
		System.out.println("Sua temperatura em fahrenheit é de :" + calculo + "°");
		
		//3
		
		double reais;
		System.out.println("Digite o valor em real ");
		reais = scanner.nextDouble();
		double dolar = reais / 5.70;
		System.out.println("Seu valor convertido é de " + dolar + "dólares ");
		
		//4
		
		double base;
		double altura;
		System.out.println("Informe a base do triângulo: ");
		base = scanner.nextDouble();
		System.out.println("Agora informe a altura dele: ");
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("Sua área é de: " + area);
		
		//5 
		
		double idade;
	    System.out.println("Informe sua idade ");
		idade = scanner.nextDouble();
		double meses = idade * 12;
		System.out.println("Sua idade em meses é de: " + meses);
		
		//6 
		
		double minuto;
		System.out.println("Informe um tempo em minutos: ");
		minuto = scanner.nextDouble();
		double segundos = minuto * 60;
		System.out.println("Sua minutagem em segundos é de: " + segundos);
		
		//7 
		
		double produto;
		System.out.println("Insira o preço do produto: ");
		produto = scanner.nextDouble();
		double quantidade;
		System.out.println("Agora insira a quantidade do produto que você comprou: ");
		quantidade = scanner.nextDouble();
		double total = produto * quantidade;
		System.out.println("O custo total é de " + total);
		
		//8
		
		double valor;
		double pessoas;
		System.out.println("Qual o preço total da conta? ");
		valor = scanner.nextDouble();
		System.out.println("Quantas pessoas há na mesa? ");
		pessoas = scanner.nextDouble();
		double custo = valor / quantidade;
		System.out.println("Cada pessoa irá pagar R$ " + custo);
		
		//9 
		
		double compra;
		double cliente;
		System.out.println("Informe o valor da compra: ");
		compra = scanner.nextDouble();
	    System.out.println("Agora informe o valor pago pelo cliente ");
	    cliente = scanner.nextDouble();
	    double troco = cliente - compra;
	    System.out.println("O valor do troco é de: " + troco);
		
		
		
		
	}
}
