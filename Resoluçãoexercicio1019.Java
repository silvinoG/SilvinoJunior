import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
   
    int segundos;
   
    System.out.println("Digite os segundos: ");
    segundos = sc.nextInt();
    
    int horas = segundos / 3600;
    segundos = segundos % 3600;
    
    int minutos = segundos / 60;
    segundos = segundos % 60;
    
    segundos = segundos;
    
    System.out.println(horas + ":" + minutos + ":" + segundos);
   }
}
