import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int A;
    int B;
    int C;
    int D;
    int CD;
    int AB;
    
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    
    CD = C + D;
    AB = A + B;
    
    if(B > C && D > A && CD > AB && C > 0 && D > 0){
        if(A == 2);

    System.out.println("Valores aceitos");
    }else
    System.out.println("Valores nao aceitos");
        
    }
}
