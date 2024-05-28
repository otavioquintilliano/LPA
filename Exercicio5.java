import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
   int[] numeros = new int[10];
    int produtoPares = 1;
    int somaImpares = 0;

    System.out.println("Enter 10 integers: ");

    for(int i = 0; i < 10; i++) {
        numeros[i] = leia.nextInt();;
        }
    for(int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) { // If the number is even
                produtoPares *= numeros[i]; // Multiply by the product of the pairs
            } else { // If the number is odd
                somaImpares += numeros[i]; // Sum to odd numbers
            }
        }
        System.out.println("The multiplication of pairs is: " + produtoPares);
        System.out.println("\nThe sum of the odd numbers is: " + somaImpares);
  }
}