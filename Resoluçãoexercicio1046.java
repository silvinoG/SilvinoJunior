import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int hi;
    int hf;
    int h = 0;
    
    hi = sc.nextInt();
    hf = sc.nextInt();
    
    if(hi < hf){
        h = hf - hi;
        System.out.println("O JOGO DUROU "+ h +" HORA(S)");
    }else{
        h = ((24 - hi) + hf);
        System.out.println("O JOGO DUROU "+ h +" HORA(S)");
    }
    }
}
