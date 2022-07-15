package projetocalculadora;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

      double num1, num2, resultado;
      System.out.println("Digite o primeiro numero:");
      Scanner leia = new Scanner(System.in);
      num1 = leia.nextDouble();
      System.out.println("Digite o segundo numero:");
      num2 = leia.nextDouble();

      Soma soma = new Soma();
      resultado = soma.soma(num1, num2);
      System.out.println("A soma é: " + resultado);
      Subtracao subtracao = new Subtracao();
      resultado = subtracao.subtracao(num1, num2);
      System.out.println("A subtração é: " + resultado);
      Divisao divisao = new Divisao();
      resultado = divisao.divisao(num1, num2);
      System.out.println("A divisão é: " + resultado);
      Multiplicacao multiplicacao = new Multiplicacao();
      resultado = multiplicacao.multiplicacao(num1,num2);
      System.out.println("A multiplicação é: " + resultado);
      
    }
}
