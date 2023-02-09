// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        var tamanho = leitor.nextInt();
         String porcentagem = "";
         for (int i = 0 ;i<tamanho ;i++)
            porcentagem+="/";
            
        System.out.println(porcentagem);
         
    }
}
