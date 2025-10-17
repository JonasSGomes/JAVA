package lista20;

import java.util.Scanner;

public class lista20 {

		public static void main(String[] args) {
			
			 Scanner scanner = new Scanner (System.in);
			 
		    repetirSaudacao();
		    retangulo();
		    imprimirMultiplos5();
		    contagemCrescente();
		    mostrarMeses();
		    verificarDivisivelPor5(10);
		    despedida("João");
		    unirNomes("Maria", "Silva");
		    verificarMaiorQue100(150);
		    classificarVelocidade(90);
		    saudacaoDiaSemana("segunda-feira");
		    verificarEstoque(8);
		    
		    System.out.print("Digite um número para verificar se é divisível por 5: ");
		    int numero = scanner.nextInt();
		    verificarDivisivelPor5(numero);

		    System.out.print("Digite um nome para a despedida: ");
		    scanner.nextLine(); 
		    String nome = scanner.nextLine();
		    despedida(nome);

		    System.out.print("Digite o primeiro nome: ");
		    String primeiroNome = scanner.nextLine();
		    System.out.print("Digite o sobrenome: ");
		    String sobrenome = scanner.nextLine();
		    unirNomes(primeiroNome, sobrenome);

		    System.out.print("Digite um número para verificar se é maior que 100: ");
		    int numero2 = scanner.nextInt();
		    verificarMaiorQue100(numero2);

		    System.out.print("Digite a velocidade para classificar: ");
		    int velocidade = scanner.nextInt();
		    classificarVelocidade(velocidade);

		    scanner.nextLine(); 
		    System.out.print("Digite o dia da semana para a saudação: ");
		    String dia = scanner.nextLine();
		    saudacaoDiaSemana(dia);

		    System.out.print("Digite a quantidade em estoque: ");
		    int quantidade = scanner.nextInt();
		    verificarEstoque(quantidade);

		
	}

	
		 
		// 1
		    public static void repetirSaudacao() {
		        System.out.println("Repetindo uma saudação");
		        for (int i = 0; i < 5; i++) {
		            System.out.println("Bom dia!");
		        }
		        System.out.println();
		    }

		    // 2
			public static void retangulo () {
				System.out.println("------------------------------");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
				System.out.println("* * * * * * * * * * * * * * * * *");
		    }

		    // 3
		    public static void imprimirMultiplos5() {
		    	System.out.println("------------------------------");
		        System.out.println("Imprimindo múltiplos de 5");
		        for (int i = 5; i <= 25; i += 5) {
		            System.out.println(i);
		        }
		        System.out.println();
		    }

		    // 4
		    public static void contagemCrescente() {
		    	System.out.println("------------------------------");
		        System.out.println("Exibindo contagem crescente");
		        for (int i = 1; i <= 8; i++) {
		            System.out.print(i + " ");
		        }
		        System.out.println("Pronto!\n");
		    }

		    // 5
		    public static void mostrarMeses() {
		    	System.out.println("------------------------------");
		        System.out.println("Mostrando os meses do ano");
		        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		        for (String mes : meses) {
		            System.out.println(mes);
		        }
		        System.out.println();
		    }

		    //  Funções com parâmetro 

		    // 1
		    public static void verificarDivisivelPor5(int numero) {
		    	System.out.println("------------------------------");
		        System.out.println("Verificando divisibilidade de " + numero);
		        if (numero % 5 == 0) {
		            System.out.println(numero + " é divisível por 5");
		        } else {
		            System.out.println(numero + " não é divisível por 5");
		        }
		        System.out.println();
		    }

		    // 2
		    public static void despedida(String nome) {
		    	System.out.println("------------------------------");
		        System.out.println("Mensagem de despedida");
		        System.out.println("Até logo, " + nome + "!\n");
		    }

		    // 3
		    public static void unirNomes(String primeiroNome, String sobrenome) {
		    	System.out.println("------------------------------");
		        System.out.println("Unindo nomes");
		        System.out.println(primeiroNome + " " + sobrenome + "\n");
		    }

		    // 4
		    public static void verificarMaiorQue100(int numero) {
		    	System.out.println("------------------------------");
		        System.out.println("4 – Verificando se " + numero + " é maior que 100");
		        if (numero > 100) {
		            System.out.println(numero + " é maior que 100");
		        } else {
		            System.out.println(numero + " não é maior que 100");
		        }
		        System.out.println();
		    }

		    // 5
		    public static void classificarVelocidade(int velocidade) {
		    	System.out.println("------------------------------");
		        System.out.println("Classificando velocidade: " + velocidade);
		        if (velocidade < 40) {
		            System.out.println("Lenta");
		        } else if (velocidade <= 80) {
		            System.out.println("Normal");
		        } else {
		            System.out.println("Rápida");
		        }
		        System.out.println();
		    }

		    // 6
		    public static void saudacaoDiaSemana(String dia) {
		    	System.out.println("------------------------------");
		        System.out.println("Saudação por dia da semana");
		        System.out.println("Tenha uma ótima " + dia + "!\n");
		    }

		    // 7
		    public static void verificarEstoque(int quantidade) {
		    	System.out.println("------------------------------");
		        System.out.println("Situação de estoque: " + quantidade);
		        if (quantidade >= 10) {
		            System.out.println("Estoque suficiente");
		        } else if (quantidade >= 5) {
		            System.out.println("Estoque baixo");
		        } else {
		            System.out.println("Estoque crítico");
		        }
		        System.out.println();
		    }
		}