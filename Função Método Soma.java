import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
    
        int valor1;
        int valor2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        valor1 = sc.nextInt();
        
        System.out.println("Digite o valor 2: ");
        valor2 = sc.nextInt();
        
        System.out.println("--------------------");
        
            System.out.println(imprime() + soma(valor1, valor2));
    
    }
    
        public static int soma(int valor1, int valor2){
        return valor1 + valor2;
    }
    
        public static String imprime(){
        return "Soma = ";
    }
    
}
