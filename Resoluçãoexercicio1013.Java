import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     
     int a;
     int b;
     int c;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite o valor a: ");
     a = sc.nextInt();
     
     System.out.println("Digite o valor b: ");
     b = sc.nextInt();
     
     System.out.println("Digite o valor c: ");
     c = sc.nextInt();
     
     int maiorab = (a + b + Math.abs(a - b)) /2;
     int maiorabc = (maiorab + c + Math.abs(maiorab - c)) / 2;
     
     System.out.println(maiorabc + " eh o maior");
     
    }
}
