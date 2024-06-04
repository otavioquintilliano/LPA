import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    String inver = "";
         
        System.out.println("Digite um número");
        String numero = leia.next();
         
        for(int i = (numero.length() - 1); i >= 0; i--){
            inver += numero.charAt(i);
        }
         
        System.out.println("o inverso do número é: " + inver);
    }
  }