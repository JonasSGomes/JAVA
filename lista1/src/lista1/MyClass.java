package lista1;

import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
	 
	  Scanner scanner = new Scanner(System.in);
  
	  //1
   
   double instalacao = 300.00;
   double limpeza = 150.00;
   double manutencao = 499.99;
   double pagamento = instalacao + limpeza + manutencao;
   System.out.println("O Cliente deverá pagar " + pagamento);
   
   //2
   
   double salario = 35.00;
   int horas = 8;
   double recebimento = salario * horas;
   System.out.println("Joaquim irá receber " + recebimento);
   
   //3
   int unidades = 27;
   int comprado = 16;
   double bomboms = unidades * comprado;
   System.out.println("A quatidade de bomboms que Pamela recebeu foram " + bomboms);
   
   //4
   int vendeu = 300;
   int caixa = 20;
   double usadas = vendeu / caixa;
   System.out.println("A Quatidade de garrafas usadas foram de " + usadas);
   
   //5
   int comprou = 120;
   int vendidas = 80;
   double custou = 30.00;
   int comprou2 = 50;
   double faturamento = vendidas * custou;
   double estoque = comprou - vendidas + comprou2;
   System.out.println("O lucro foi de " + faturamento + "e a quantidade de camisetas foi " + estoque);
   
   //6
   
   double num1 = 10;
   double calculo = 10 * 2;
   double calculo2 = 10 / 2;
   System.out.println("O dobro é " + calculo + "E a metade é de " + calculo2);
   }
}