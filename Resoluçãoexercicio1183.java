import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double s = 0;
    char l = 'S'+'M';
    double [][] a = new double [12][12]; //matriz de 12
    
    l = sc.next().charAt(0); //entrada do caractere 
    
    for(int i=0; i<a.length; i++){    // linha da matriz
        for(int j= 0; j<a[i].length; j++){  //coluna da matriz
            a[i][j] = sc.nextDouble();   //entrada dos valores 
        }
    }
    for(int i=0; i<a.length; i++){   //linha da matriz
        for(int j= 0; j<a[i].length; j++){   //coluna da matriz
        if(j > i)   //valores da diagonal de cima
        s = s + a[i][j];   //soma dos valores
        }
    }
    if(l == 'M')   //se l receber M
        s /= ((a.length * a.length) - 12) / 2; //multiplica a linha pela coluna
                                              //subtrai pela tamanho da matriz
                                             //divide pela soma dos valores
                                            //da matriz diagonal de cima
      System.out.printf("%.1f\n",s);           
    }
}
