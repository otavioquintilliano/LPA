import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    int[] numeros = new int[5]; value = 1; divisors = 0;
    String = prime; value = 1; divisors = 0;

   for(int i = 0; i < 5; i++){
    System.out.println("Enter the value for index ",i,": ");
    leia(n[i]);
}

// Structure for storing numbers in the vector.
for(int i = 0; i < 5; i++){
  value = 1;
  divisors = 0;

    if(n[i] > 0){ // I check if n[i] is greater than zero.

    // If so, a repetition counts the divisors of n[i] between 1 and n[i] itself.
      while(value <= n[i]){
        if(n[i] % value == 0){
          divisors++; // Counts the number of divisors
        }
        value++; // Counts up to the number of n[i]
      }
      // Finally, if the number of divisors is exactly 2, then we have a prime number.
      if(dividers == 2){
        System.out.println("The number ", n[i], " is prime!\n");
      }
      else{
        System.out.println("The number ", n[i], " is not prime!\n");
      }
    }
    else{
      System.out.println("Negative value or equal to zero!\n");
    }
}
}