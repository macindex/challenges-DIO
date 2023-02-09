
/*Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam. Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.
 
Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.
Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).
Saída
A saída é o perímetro P do polígono regular em uma única linha.
 
Exemplos de Entrada	Exemplos de Saída
3 1					3
 
9 8					72
 
1000000 1000		1000000000
Prova 1 de Programação de Computadores da UNILA (2015/2)

 */

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N = scan.nextLine();
    String[] split = N.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
    
    System.out.println(P);
    scan.close();
  }
}
