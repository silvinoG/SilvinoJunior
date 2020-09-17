import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);

    int a;
    int b;
    int c;
    
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    
    if((a < b) && (a < c)){
        if(b < c){
            System.out.printf(a +"\n"+ b +"\n"+ c +"\n");
        }else
            System.out.printf(a +"\n"+ c +"\n"+ b +"\n");
    }
    if((b < a) && (b < c)){
        if(a < c){
            System.out.printf(b +"\n"+ a +"\n"+ c +"\n");
        }else
            System.out.printf(b +"\n"+ c +"\n"+ a +"\n");
    }
    if((c < a) && (c < b)){
        if(a < b){
            System.out.printf(c +"\n"+ a +"\n"+ b +"\n");
        }else
            System.out.printf(c +"\n"+ b +"\n"+ a +"\n");
    }
            System.out.printf("\n");
            
            System.out.printf(a+ "\n"+ b +"\n" + c+"\n");
        }
    }
