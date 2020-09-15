import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
Scanner sc = new Scanner (System.in);

    int c;
    int q;
    double s= 0;
    
    c = sc.nextInt();
    q = sc.nextInt();
    
    if(c == 1){
        s = q * 4.00;
        System.out.printf("Total: R$ %.2f\n", s);
    }else
    if(c == 2){
        s = q * 4.50;
        System.out.printf("Total: R$ %.2f\n", s);
    }else
    if(c == 3){
        s = q * 5.00;
        System.out.printf("Total: R$ %.2f\n", s);
    }else
    if(c == 4){
        s = q * 2.00;
        System.out.printf("Total: R$ %.2f\n", s);
    }else
    if(c == 5){
        s = q * 1.50;
        System.out.printf("Total: R$ %.2f\n", s);
        } 
    }
}
