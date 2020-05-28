import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
   
    int dias;
   
    System.out.println("Digite a idade: ");
    dias = sc.nextInt();
    
    System.out.println(dias / 365 + " ano (s)");
    dias = dias % 365;
    
    System.out.println(dias / 30 + " mes (es)");
    dias = dias % 30;
    
    System.out.println(dias + " dia (s)");
   }
}
