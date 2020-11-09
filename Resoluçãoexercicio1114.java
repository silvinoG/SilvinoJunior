import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    int x = 0;
    
    while(x != 2002){
        
    x = sc.nextInt();
    
    if(x == 2002){
        System.out.println("Acesso Permitido");
    }else
        System.out.println("Senha Invalida");
    }
        }
    }
