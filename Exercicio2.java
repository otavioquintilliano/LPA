import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in);
	
	int[] numeros = new int[10];

	
	for (int i=0; i < numeros.length; i++) {
	    System.out.println("Qual o valor dos 10 números: ");
	    numeros[i] = leia.nextInt();
	}
	
	int soma = 0;
	
	for (int numero : numeros) {
	    soma += numero;
	    
	}
	    
	    System.out.println("A soma dos elementos do vetor é de: " + soma);
	}
}