import java.util.Scanner;
public class MyClass {
    public static void main (String args []){
        
    Scanner sc = new Scanner (System.in);
    
    int v;
    
    System.out.println("Digite o valor");
    v = sc.nextInt();
    
    //v = v / 100;
    System.out.println(v / 100 +" nota (s) de 100.00");
    v = v % 100;
    
    //v = v/ 50;
    System.out.println(v / 50 +" nota (s) de 50.00");
    v = v % 50;
    
    //v = v / 20;
    System.out.println(v / 20 +" nota (s) de 20.00");
    v = v % 20;
    
    //v = v / 10;
    System.out.println(v / 10 +" nota (s) de 10.00");
    v = v % 10;
    
    //v = v / 5;
    System.out.println(v / 5 +" nota (s) de 5.00");
    v = v % 5;
    
    //v = v / 2;
    System.out.println(v / 2 +" nota (s) de 2.00");
    v = v % 2;
    
    //v = v / 1;
    System.out.println(v / 1 +" nota (s) de 1.00");
    v = v % 1;
    
    }
}
