import java.io.IOException;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) throws IOException {
    
    Scanner sc = new Scanner(System.in); 
    
    int X;
    int Y;
    double soma;
    
    System.out.println("Digite o código do produto: ");
        X = sc.nextInt();
    
    System.out.println("Digite a quantidade de produtos: ");
        Y = sc.nextInt();
      
      switch (X) {
      
      case 1: {
        soma = Y * 4.00;break;
    } case 2: {
        soma = Y * 4.50;break;
    } case 3: {
        soma = Y * 5.00;break;
    } case 4: {
        soma = Y * 2.00;break;
    } case 5: {
        soma = Y * 1.50;break;
    }
      default: soma = 0;
    }
    System.out.println(String.format("Total: R$ %.2f", soma));
    }
}
