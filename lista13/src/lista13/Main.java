package lista13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1
       
        int i = 10;
        while (i <= 30) {
            System.out.println(i);
            i++;
        }
        
        //2
        System.out.println("Classificação de Idades:");
        int contador = 1;
        while (contador <= 3) { 
            System.out.print("Digite a idade " + contador + ": ");
            int idade = scanner.nextInt();
            
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
            contador++;
        }
        
        //3
        System.out.println("Eleição:");
        int votos = 1;
        while (votos <= 3) { 
            System.out.print("Digite o voto " + votos + " (1-6): ");
            int voto = scanner.nextInt();
            
            if (voto == 1) System.out.println("Votou no Candidato 1");
            else if (voto == 2) System.out.println("Votou no Candidato 2");
            else if (voto == 3) System.out.println("Votou no Candidato 3");
            else if (voto == 4) System.out.println("Votou no Candidato 4");
            else if (voto == 5) System.out.println("Voto Nulo");
            else if (voto == 6) System.out.println("Voto em Branco");
            else System.out.println("Voto inválido!");
            
            votos++;
        }
        
        //4
        System.out.println("Repetição de Frase:");
        scanner.nextLine(); 
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Quantas vezes repetir? ");
        int vezes = scanner.nextInt();
        
        int j = 0;
        while (j < vezes) {
            System.out.println(frase);
            j++;
        }
        
        //5
        int k = 50;
        while (k >= 30) {
            System.out.println(k);
            k--;
        }
        
        //6
        System.out.println("Números Alternados (1 a 50):");
        int num = 1;
        while (num <= 50) {
            System.out.println(num);
            num += 2;
        }
        
        //7
        System.out.println("Aprovado ou Reprovado:");
        int contNotas = 1;
        while (contNotas <= 3) { 
            System.out.print("Digite a nota " + contNotas + ": ");
            double nota = scanner.nextDouble();
            
            if (nota >= 6.0) System.out.println("Aprovado");
            else System.out.println("Reprovado");
            
            contNotas++;
        }
        
        //8 
        System.out.println("Categoria de Idade:");
        int contIdades = 1;
        while (contIdades <= 3) { 
            System.out.print("Digite a idade " + contIdades + ": ");
            int idade = scanner.nextInt();
            
            if (idade <= 12) System.out.println("Criança");
            else if (idade <= 17) System.out.println("Adolescente");
            else if (idade <= 59) System.out.println("Adulto");
            else System.out.println("Idoso");
            
            contIdades++;
        }
        
        //9 
        System.out.println("Número Positivo ou Negativo:");
        int contNumeros = 1;
        while (contNumeros <= 3) {
            System.out.print("Digite o número " + contNumeros + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > 0) System.out.println("Positivo");
            else if (numero < 0) System.out.println("Negativo");
            else System.out.println("Zero");
            
            contNumeros++;
        }
        
    }
}