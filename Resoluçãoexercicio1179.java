import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int n = 0;
    int i = 0;
    int p = 0;
    int a = 0;
    int c = 0;
    int [] x = new int [5];  //vetor x
    int [] y = new int [5]; //vetor y
    
    for(i=0; i<15; i++){   //leia 15 inteiros
        n = sc.nextInt();
        
    if(n % 2 == 0){      //se o inteiro for par
        x[p] = n;       //armazene-o no vetor 
        p = p + 1;     //faça a imcrementação
    if(p == 5){       //se o vetor atingir 5 posições
        p = 0;       // reinicia o vetor
    for(a=0; a<5; a++){  
    System.out.println("par["+a+"] = "+x[a]); //imprima os 5 vetores
            }
        }
    }else{            // senão
        y[c] = n;    //se o inteiro for impar armazene-o no vetor
        c = c + 1;  // faça a imcrementação
    if(c == 5){    // se o vetor atingir 5 posições 
        c = 0;    //reinicia o vetor
    for(a=0; a<5; a++){
    System.out.println("impar["+a+"] = "+y[a]); //imprima os 5 vetores
                }
            }
        }
    }
    for(i=0; i<c; i++){
    System.out.println("impar["+i+"] = "+y[i]);    //imprima a posição e o valor
    }                                             // de impar
    for(i=0; i<p; i++){
    System.out.println("par["+i+"] = "+x[i]);   //imprima a posição e o valor
        }                                      // de par
    }
}
