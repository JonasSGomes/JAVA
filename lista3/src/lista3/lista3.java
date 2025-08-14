package lista3;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
		//1
		
	double num1;
	double num2;
	System.out.println("Escreva um número: ");
	num1 = scanner.nextDouble();
	System.out.println("Escreva outro número ");
	num2 = scanner.nextDouble();
	double soma = num1 + num2;
	System.out.println("A soma dos número é de: " + soma);
	
	//2
	
	double num3;
	double num4;
	System.out.println("insira um número; ");
	num3 = scanner.nextDouble();
	System.out.println("Insira outro número");
	num4 = scanner.nextDouble();
	double div =  num3 / num4;
	System.out.println("A divisão desses dois números é de: " + div);
	
	//3
	
	double lado1;
	double lado2;
	double lado3;
	System.out.println("Informe um número: ");
	lado1 = scanner.nextDouble();
	System.out.println("Informe outro número: ");
	lado2 = scanner.nextDouble();
	System.out.println("Informe o último número ");
	lado3 = scanner.nextDouble();
	double perimetro = lado1 + lado2 + lado3;
	System.out.println("O perímetro é de:");
	
	//4
	
	 double valor;
	 double gorjeta;
	 System.out.println("Qual o valor da conta total? ");
	 valor = scanner.nextDouble();
	 System.out.println("Qual a porcentagem de gorjata desejada? ");
	 gorjeta = scanner.nextDouble();
	 double conta = valor * (gorjeta/100);
	 double total = valor + conta;
	 System.out.println("O valor da gorjeta é: " + conta + "E o total a pagar é de: " + total + " reais");
	 
	 //5
	 
	 double raio;
	 System.out.println("Informe o raio do circulo: ");
	 raio = scanner.nextDouble();
	 double area = 3.14159 * raio * raio;
	 System.out.println("Sua área é de: " + area);
	 
	 //6
	 
	 double idade;
	 System.out.println("Informe sua idade ");
	 idade = scanner.nextDouble();
	 double meses = idade * 12;
	 double dias = (idade * 365) + (meses * 30); 
	 System.out.println("Você viveu: " + dias);
	 
	 //7
	 
	 double horas;
	 double pago;
	 System.out.println("Quantas horas você trabalhou? ");
	 horas = scanner.nextDouble();
	 System.out.println("Qual o valor pago por hora? ");
	 pago = scanner.nextDouble();
	 double bruto = horas * pago;
	 double imposto = bruto * 0.10;
	 double liquido = bruto - imposto;
	 System.out.println("O valor bruto é de: " + bruto + "O valor do imposto é de: " + imposto + "Por último, o salário líquido é de " + liquido);
	 
	}

}
