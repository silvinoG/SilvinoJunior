import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int l = 0;
    char c = 'S'+'M'; //caracteres de escolha
    double s = 0;
    double [][] a = new double [12][12]; //matriz
    
    l =  sc.nextInt();   //linha a ser calculada
    c = sc.next().charAt(0);  //caractere 
    
    for(int i = 0; i<a.length; i++){ //linha da matriz
        for(int j = 0; j<a[i].length; j++){  //coluna da matriz
        
    a[i][j] = sc.nextDouble(); //entrada dos valores da matriz
        }
    }
    for(int j = 0; j<a.length; j++){ //linha escolhida
            s = s + a[l][j]; //soma dos valores da linha escolhida
        }
        if(c == 'M'){  //caso escolhido M 
            s = s / a.length;  // soma os valores da linha e divide
        }                     //pelo tamanho da matriz
      System.out.printf("%.1f\n",s); //imprime o resultado    
        }
    }
