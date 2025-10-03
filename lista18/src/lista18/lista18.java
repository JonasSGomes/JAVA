package lista18;

import java.util.Scanner;

public class lista18 {

	public static void main(String[] args) { 
		mensagem();
		frase();
		imprimir();
		vogal();
		quadrado();
		par();
		regressiva();
		triangulo();
		dias ();
		
		
		}
	//1
	public static void mensagem () {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Jonas");
}
	}

	//2

		public static void frase () {
			System.out.println("------------------------------");
			 System.out.println("Nunca desista, sempre persista.");
		}
	
	//3
		
		public static void imprimir () {
			System.out.println("------------------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
		
	//4
		public static void vogal () {
		System.out.println("------------------------------");
			char [] vogais = {'A', 'E', 'I', 'O', 'U', 'Y'};
			System.out.println(vogais);
		}
		
	//5
		public static void quadrado () {
			System.out.println("------------------------------");
			int quad = 5;
			for (int i = 1; i <= 8; i++) {
				System.out.println("* * * * * * * *");
			}
		}
	//6
		public static void par () {
			System.out.println("------------------------------");
			for(int i = 2; i <= 20; i+=2) {
				System.out.println(i);
			}
			
			}
		
	//7
			public static void regressiva () {
				System.out.println("------------------------------");
				for (int i = 10; i >= 1; i--) {
					System.out.println(i);
				}
				System.out.println("Fim!");
			}
		
		
	//8
			
			public static void triangulo () {
				System.out.println("------------------------------");
				System.out.println("*");
				System.out.println("* *");
				System.out.println("* * *");
				System.out.println("* * * * ");
				System.out.println("* * * * * ");
				System.out.println("* * * * * * ");
				System.out.println("* * * * * * * ");
			
			}
			
	//9
			
		public static void dias () {
		String semana = "Domingo\n"+"Segunda-Feira\n"+"Terça-Feira\n"+"Quarta-Feira\n"+"Quinta-Feira\n"+"Sexta-Feira\n"+"Sábado\n";
		System.out.println(semana);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	



