import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     int velocidade;
     int tempo;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite o tempo: ");
     tempo = sc.nextInt();
     
     System.out.println("Digite a velocidade: ");
     velocidade= sc.nextInt();
     
     double litros  = (tempo * velocidade)/ 12.0;
     
     System.out.printf("%.3f\n", litros);
     
    }
}
