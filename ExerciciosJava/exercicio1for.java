import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    int[] numeros = new int[8];
    
    for (int i = 0; i < numeros.lengath; i++) {
        nymeros[i] = leia.nextInt();
        
    }

    int maiorElemento = numeros[0];
    int posicaoMaior = 0;
    
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maiorElemento) {
            maiorElemento = numeros[i];
            posicaoMaior = i;
            
            System.out.println("O maior elemento é: " + maiorElemento);
            System.out.println("Sua posição no vetor é: " + posicaoMaior);
        }
    }