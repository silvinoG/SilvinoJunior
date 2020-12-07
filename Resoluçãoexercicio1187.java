import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    double [][] a =  new double [12][12];
    double s = 0;
    char l = 'S'+ 'M';
    
    l = sc.next().charAt(0);
    
    for(int i=0; i<a.length; i++){
        for(int j=0; j<a[i].length; j++){
            a[i][j] = sc.nextDouble();
        }
    }
    for(int i=0; i<a.length; i++){
        for(int j=0; j<a[i].length; j++){
            if(j > i && j < a.length - i - 1)
            s = s + a[i][j];
        }
    }
    if(l == 'M')
        s = s / 30;
      System.out.printf("%.1f\n", s);
    }
}
