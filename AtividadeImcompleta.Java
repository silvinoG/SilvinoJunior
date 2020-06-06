import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int X = 0;
    int A = 0;
    int B = 0;
    int C;
    int D;
    double AC = 0;
    double BC = 0;
    
    X = sc.nextInt();
    
    for(D=1; D<=X; D++){
        C = 0;
      
    //System.out.printf("%d%d", A, B);
    //System.out.printf("%f%f", AC, BC);
        
    while(A<=B) {
        A*= (AC/100.0) + 1.0;
        B*= (BC/100.0) + 1.0;
        C++;
    if(C<=100) {
            System.out.printf("%d Anos.\n", C);
        }
    if(C>100) {
            System.out.printf("Mais de um século.\n");
        break;
        }
    }
}
    }
}
