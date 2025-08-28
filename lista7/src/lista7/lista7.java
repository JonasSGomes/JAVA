package lista7;

import java.util.Scanner;

public class lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//1
		
		System.out.println("Qual sua idade");
		int idade = scanner.nextInt();
		if (idade <= 16 || idade >= 70) {
			System.out.println("Classificação especial.");
		} else {
			System.out.println("Classificação regular");
		}
		
		//2
		
		System.out.println("Qual o valor do produto?");
		double valor = scanner.nextDouble();
		System.out.println("Qual a quantidade comprada?");
		double quant = scanner.nextDouble();
		double total = valor * quant;
		if (valor >= 200 && quant >= 5) {
			double desconto = valor * 0.15;
			System.out.println("Você ganhou desconto de: " + desconto + "reais");
		} else {
			System.out.println("Não ganhou desconto");
		}
		
		//3
		
		System.out.println("Qual sua frequência cardíaca?");
		double freq = scanner.nextDouble();
		System.out.println("Você sente tontura? (sim/não)");
		String paciente = scanner.next();
		if (freq >= 100 || paciente.equalsIgnoreCase("sim")) {
			System.out.println("Procure atendimento médico.");
		} else {
			System.out.println("Sem sinais de alerta.");
		}
		
		//4
		
		System.out.println("Qual sua idade?");
		int idade2 = scanner.nextInt();
		System.out.println("Você é residente do estado? (sim/não)");
		String candidato = scanner.next();
		if(idade2 > 18 && idade2 < 30 && candidato.equalsIgnoreCase("sim")) { 
			System.out.println("Elegível para o concurso.");
		} else {
			System.out.println("Não elegível para o concurso.");
		}
		
		//5
		
		System.out.println("Qual o número de projetos concluídos?");
		int projetos = scanner.nextInt();
		System.out.println("E qual o número de erros reportados");
		int erros = scanner.nextInt();
		if(projetos >10 && erros <3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}
		
		//6
		
		System.out.println("Qual sua idade");
		int idade3 = scanner.nextInt();
		System.out.println("Seu passaporte é válido (sim/não)");
		String passaporte = scanner.next();
		if(idade >= 18 && passaporte.equalsIgnoreCase("sim")) {
			System.out.println("Viagem autorizada.");
		} else {
			System.out.println("Viagem não autorizada.");
		}
		
		//7
		
		System.out.println("Qual a nota final?");
		double nota = scanner.nextDouble();
		System.out.println("Qual o número de aulas assistidas?");
		double aulas = scanner.nextDouble();
		if (nota >= 70 && nota <=100 && aulas >=40 && aulas <=50) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		//8
		
		System.out.println("Qual a umidade do solo?");
		double umidade = scanner.nextDouble();
		System.out.println("Qual a temperatura?");
		double temp = scanner.nextDouble();
		if (umidade <30 || temp >30) {
			System.out.println("Irrigação necessária.");
		} else {
			System.out.println("Irrigação não necessária.");
		}
		
		//9
		
		System.out.println("Qual sua idade?");
		int idade4 = scanner.nextInt();
		System.out.println("Você possui experiência prévia");
		String expe = scanner.next();
		if (idade4 >=20 && idade4 <=40 && expe.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição aceita.");
		} else {
			System.out.println("Inscrição não permitida");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
