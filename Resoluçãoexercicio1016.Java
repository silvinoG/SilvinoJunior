import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     int distancia;
     int hora;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite a Distância: ");
     distancia = sc.nextInt();
     
     hora = distancia * 2;
     
     System.out.println(hora + " minutos");
     
    }
}
