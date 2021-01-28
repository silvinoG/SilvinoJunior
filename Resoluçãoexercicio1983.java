import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    double mn = 0;
    double na = 0;
    int qa = 0;
    int m = 0;
    int ma;
    
    qa = sc.nextInt();
    
    for(int i=0; i<qa; i++){
    ma = sc.nextInt(); na = sc.nextDouble();  //entrada matricula aluno e nota aluno
    
    if(na > mn){   //se nota aluno for maior que maior numero
        mn = na;  //maior numero é igual a nota aluno
        m = ma;  //maior é igual a matricula aluno
       }
    }
        if(mn < 8){  //se maior numero for menor que 8
         System.out.println("Minimum note not reached");
    }else
        if(mn >= 8){  //se maior numero for maior ou igual a 8
        System.out.println(m);
    }else
        if(mn == 0){  //se maior numero receber 0
        System.out.println("Minimum note not reached");
            }
    }
}
