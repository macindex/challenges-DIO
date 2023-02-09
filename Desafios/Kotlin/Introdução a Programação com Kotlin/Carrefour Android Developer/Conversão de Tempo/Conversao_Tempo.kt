/*

Desafio

Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 
Exemplo de Entrada	
556

Exemplo de Saída
0:9:16

Exemplo de Entrada	
1

Exemplo de Saída
0:0:1

*/

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    val timeInSeconds: Int = scanner.nextInt()

    val hours = (timeInSeconds / 3600)
    var minutes = (timeInSeconds % 3600) / 60
    var seconds = (timeInSeconds % 3600) % 60

    println("$hours:$minutes:$seconds")
}