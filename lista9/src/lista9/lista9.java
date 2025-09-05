package lista9;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		
	int numero = 1;
	while (numero <=10) {
			System.out.println(numero);
			numero++; 
		}
		
		
		//2
		
	int numero2 =10;
	while(numero2 >= 1) {
		System.out.println(numero2);
			numero2--; 
		}
		
		
		//3
		
	int numero3 =0;
	while(numero3 <= 100) {
			System.out.println(numero3);
			numero3 +=5;
		
		}
		
		//4
		
	int algoritm = 0;
	while(algoritm <=5) {
			System.out.println("Eu gosto de Java");
			algoritm++;
	}
		
		
		//5
		
		int soma = 0;
		int numero4;
		int contador = 1;
		System.out.println("Digite 5 números:");
		while(contador <= 5) {
			
			numero4 = scanner.nextInt();
			soma += numero4;
			contador +=1;	
			
			System.out.println("A soma total é:" + soma);
		}
		
		//6
		
		
		System.out.println("Insira a senha:");
		 int num2 = scanner.nextInt();
		 while (num2 != 1234 ) {
			 System.out.println("Tente novamente");
			 num2 = scanner.nextInt();
		
		 }
		
		//7
		 
		 int num1 = 1;
		 System.out.println("Informe um numero positivo");
		 num1 = scanner.nextInt();
		 while (num1!=1) {
			 System.out.println(num1);
			 num1--;
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
