import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in); 
    
    int vA;
    int vB;
    int vC;
    int vD;
    
    System.out.println("Digite valor de A: ");
        vA = sc.nextInt();
    
    System.out.println("Digite valor de B: ");
        vB = sc.nextInt();
    
    System.out.println("Digite valor de C: ");
        vC = sc.nextInt();
    
    System.out.println("Digite valor de D: ");
        vD = sc.nextInt();
   
    
    if (vB > vC && vD > vA && vC + vD > vA + vB & vC > 0 && vD > 0 && vA % 2 == 0) {
        System.out.println("Valores aceitos.");
    }else{
        System.out.println("Valores não aceitos.");
    }
    }
}    
