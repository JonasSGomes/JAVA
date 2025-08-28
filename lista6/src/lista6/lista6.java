package lista6;

import java.util.Scanner;

public class lista6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		if(numero > 10 && numero <20) {
			System.out.println("Número dentro do intervalo.");
		}else {
			System.out.println("Número fora do intervalo.");
		}
		
		//2 
		
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Você possui convite? (true/false)");
		boolean convite = scanner.nextBoolean();
		if(idade >= 18 || convite) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		
		//3
		
		System.out.println("Qual sua idade?");
		double idade1 = scanner.nextDouble();
		if(idade1 < 12 || idade1 > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}
		
		//4
		
		System.out.println("Qual o valor do produto");
		double produto = scanner.nextDouble();
		System.out.println("Qual a forma de pagamento (avista/cartão)");
		String pagamento = scanner.next();
		if(produto > 100 && pagamento.equalsIgnoreCase("avista")) {
			System.out.println("Você recebeu 10% de desconto");
		} else {
			System.out.println("O valor sem desconto é:" + produto);
		}
		
		//5
		
		System.out.println("Qual sua temperatura?");
		double temperatura = scanner.nextDouble();
		System.out.println("Você tem sintomas? (sim/não)");
		String sintomas = scanner.next();
		if(temperatura >= 38 && sintomas.equalsIgnoreCase("sim")) {
			System.out.println("Procure um médico.");
		} else {
			System.out.println("Sem sinais preocupantes");
		}
		
		//6
		
		System.out.println("Qual sua idade?");
		double idade3 = scanner.nextDouble();
		System.out.println("Qual sua nacionalidade? (brasileiro/gringo)");
		String nacionalidade = scanner.next();
		if(idade3 >= 16 && nacionalidade.equalsIgnoreCase("brasileiro")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		//7
		
		System.out.println("Qual a quantidade de horas trabalhadas?");
		double hora = scanner.nextDouble();
		System.out.println("E o número de faltas?");
		double falta = scanner.nextDouble();
		if(hora >= 20 && falta <5) {
			System.out.println("Você ganhará bônus.");
		} else {
			System.out.println("Você não ganhará bônus.");
		}
				
		//8
		
		System.out.println("Qual sua idade?");
		double idade4 = scanner.nextDouble();
		System.out.println("Você tem carteira de motorista (sim/não)");
		String carteira = scanner.next();
		if(idade4 >= 18 && carteira.equalsIgnoreCase("sim")) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}
		
		//9
		
		System.out.println("Qual sua nota?");
		int nota = scanner.nextInt();
		System.out.println("Qual sua frequência?");
		int freq = scanner.nextInt();
		if(nota >= 8 && freq >= 80) {
			System.out.println("Bolsa concedida.");
		}else {
			System.out.println("Bolsa não concedida.");
		}
	
		//10
		
		System.out.println("Informe a temperatura (°C): ");
        double temp = scanner.nextDouble();
        System.out.println("Informe a umidade (%): ");
        double umidade = scanner.nextDouble();
        if (temp < 18 || temp > 26 && umidade > 60) {
            System.out.println("Ajustar climatização");
        } else {
            System.out.println("Climatização não necessária");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

