import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int c = 0;
    char l = 'S'+'M'; //caracteres de escolha
    double s = 0;
    double [][] a = new double [2][2]; //matriz
    
    c =  sc.nextInt();   //coluna a ser calculada
    l = sc.next().charAt(0);  //caractere 
    
    for(int i = 0; i<a.length; i++){ //linha da matriz
        for(int j = 0; j<a[i].length; j++){  //coluna da matriz
        
    a[i][j] = sc.nextDouble(); //entrada dos valores da matriz
        }
    }
    for(int j = 0; j<a.length; j++){ //coluna escolhida
            s = s + a[j][c]; //soma dos valores da coluna escolhida
        }
        if(l == 'M'){  //caso escolhido M 
            s = s / a.length;  // soma os valores da coluna e divide
        }                     //pelo tamanho da matriz
      System.out.printf("%.1f\n",s); //imprime o resultado    
        }
    }
