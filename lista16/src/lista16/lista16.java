package lista16;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		        //1
		        String[] cores = new String[6];
		        for (int i = 0; i < cores.length; i++) {
		            System.out.print("Digite a cor " + (i + 1) + ": ");
		            cores[i] = sc.nextLine();
		        }
		        System.out.println("Cores digitadas:");
		        for (int i = 0; i < cores.length; i++) {
		            System.out.println(cores[i]);
		        }

		        //2
		        double[] numerosDecimais = new double[8];
		        for (int i = 0; i < numerosDecimais.length; i++) {
		            System.out.print("Digite o número decimal " + (i + 1) + ": ");
		            numerosDecimais[i] = sc.nextDouble();
		        }
		        System.out.println("Números decimais digitados:");
		        for (int i = 0; i < numerosDecimais.length; i++) {
		            System.out.println(numerosDecimais[i]);
		        }

		        //3
		        int[] numerosInteiros = new int[10];
		        for (int i = 0; i < numerosInteiros.length; i++) {
		            System.out.print("Digite o número inteiro " + (i + 1) + ": ");
		            numerosInteiros[i] = sc.nextInt();
		        }
		        System.out.println("Números pares digitados:");
		        for (int i = 0; i < numerosInteiros.length; i++) {
		            if (numerosInteiros[i] % 2 == 0) {
		                System.out.println(numerosInteiros[i]);
		            }
		        }

		        //4
		        int[] numeros12 = new int[12];
		        for (int i = 0; i < numeros12.length; i++) {
		            System.out.print("Digite o número " + (i + 1) + ": ");
		            numeros12[i] = sc.nextInt();
		            if (numeros12[i] < 50) {
		                System.out.println("menor que 50");
		            }
		        }

		        sc.nextLine(); 

		        //5
		        String[] nomes = new String[5];
		        for (int i = 0; i < nomes.length; i++) {
		            System.out.print("Digite o nome " + (i + 1) + ": ");
		            nomes[i] = sc.nextLine();
		        }
		        System.out.print("Digite um nome para procurar: ");
		        String nomeProcurado = sc.nextLine();
		        boolean encontrado = false;
		        for (int i = 0; i < nomes.length; i++) {
		            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
		                encontrado = true;
		                break;
		            }
		        }
		        if (encontrado) {
		            System.out.println("Nome encontrado!");
		        } else {
		            System.out.println("Nome não existe.");
		        }

		        //6
		        String[] produtos = new String[4];
		        double[] precos = new double[4];
		        for (int i = 0; i < produtos.length; i++) {
		            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
		            produtos[i] = sc.nextLine();
		            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
		            precos[i] = sc.nextDouble();
		            sc.nextLine(); 
		        }
		        for (int i = 0; i < produtos.length; i++) {
		            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
		        }

		        //7
		        double[] notas = new double[6];
		        for (int i = 0; i < notas.length; i++) {
		            System.out.print("Digite a nota " + (i + 1) + ": ");
		            notas[i] = sc.nextDouble();
		        }
		        for (int i = 0; i < notas.length; i++) {
		            if (notas[i] < 6) {
		                System.out.println("Aluno reprovado");
		            } else if (notas[i] >= 6 && notas[i] <= 7) {
		                System.out.println("Aluno em recuperação");
		            } else {
		                System.out.println("Aluno aprovado");
		            }
		        }

		        //8
		        double[] ingressos = new double[5];
		        for (int i = 0; i < ingressos.length; i++) {
		            System.out.print("Digite o preço do ingresso " + (i + 1) + ": ");
		            ingressos[i] = sc.nextDouble();
		        }
		        for (int i = 0; i < ingressos.length; i++) {
		            if (ingressos[i] > 100) {
		                System.out.println("Ingresso com promoção disponível!");
		            }
		        }
		    }
		}
