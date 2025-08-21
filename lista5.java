package primeiroProjeto;

import java.util.Scanner;

public class lista5 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 //1
	 
	 double idade;
	 System.out.println("Informe sua idade:");
	 idade = scanner.nextDouble();
	 if(idade <= 12) {
		 System.out.println("Criança");
	 } else if(idade <= 17) {
		 System.out.println("Adolescente");
	 } else if(idade <= 59) {
	     System.out.println("Adulto");
	 } else {
		 System.out.println("Idoso");
	 
	 }
	 
	 //2
	 
	 double temp;
	 System.out.println("Qual a temperatura atual?");
	 temp = scanner.nextDouble();
	 if(temp <= 10) {
		 System.out.println("Muito Frio");
	 } else if( temp <= 20) {
		 System.out.println("Frio");
	 } else if(temp <=30) {
		 System.out.println("Agradável");
	 } else {
		 System.out.println("Muito Quente");
	 }
	 
	 //3 
	 
	 double nota;
	 System.out.println("Digite a nota recebida:");
	 nota = scanner.nextDouble();
	 if(nota >= 90) {
		 System.out.println("A");
	 } else if (nota >= 80) {
		 System.out.println("B");
	 } else if (nota >= 70) {
		 System.out.println("C");
	 } else if (nota >= 60) {
		 System.out.println("D");
	 } else {
		 System.out.println("F");
	 }
	
	 //4
	 
	 String senha = "admin";
	 if(senha == "admin") {
		 System.out.println("Acesso permitdo!");
	 } else {
		 System.out.println("Acesso negado!");
	 }
	 
	 //5
	 
	 System.out.println("Digite dois nomes:");
	 String plvr1 = scanner.next();
	 String plvr2 = scanner.next();
	 if(plvr1.equals(plvr2)) {
	 System.out.println("Os nomes são iguais");
	 } else {
		 System.out.println("Os nomes são diferentes");
	 }
	 
	 //6 
	 
	 System.out.println("informe uma cor: ");
		String cor = scanner.next();
		if(cor.equals("azul")) {
			System.out.println("Boa Escolha!");
		} else if (cor.equals("vermelho")) {
			System.out.println("Cor vibrante!");
		} else if (cor.equals("verde")){
			System.out.println("Cor da natureza!");
		} else {
			System.out.println("Cor não cadastrada.");
		}
		
     //7
		
		System.out.println("informe uma letra:");
		String letra = scanner.next();
		if(letra.equals("a")) {
			System.out.println("É uma vogal.");
		} else if (letra.equals("e")) {
			System.out.println("É uma vogal.");
		} else if (letra.equals("i")) {
			System.out.println("É uma vogal.");
		} else if (letra.equals("o")) {
			System.out.println("É  uma vogal");
		} else if (letra.equals("u")) { ;
			System.out.println("É uma vogal");
		} else {
		System.out.println("Não é uma vogal.");
	}
}
}


