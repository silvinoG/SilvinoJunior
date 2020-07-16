import java.util.Scanner;
public class MyClass {
    public static void main (String args []) {
        
    Scanner sc = new Scanner (System.in);    
    
    double [][] n = new double [2][4];
    double s = 0;

    n [0][0] = 7.0;
    n [0][1] = 5.0;
    n [0][2] = 3.9;
    n [0][3] = 4.0;
    
    
    n [1][0] = 8.5;
    n [1][1] = 2.2;
    n [1][2] = 3.4;
    n [1][3] = 8.0;
   
    
    for(int i=0; i<n.length; i++){
        //System.out.print(n[i] +" ");
    
    for(int j=0; j<n[i].length; j++){
        System.out.print(n[i][j] + " ");
    }
    
    System.out.println();
}
    n [1][3] = 7.0;
    System.out.println();
    
    for(int i=0; i<n.length; i++){
        //System.out.print(n[i] +" ");
    
    for(int j=0; j<n[i].length; j++){
        System.out.print(n[i][j] + " ");
}
    System.out.println();
}
    System.out.println();
    
    for(int i=0; i<n.length; i++){
        //System.out.print(n[i] +" ");
    
    for(int j=0; j<n[i].length; j++){
        //System.out.print(n[i][j] + " ");
    
    s = s + n[i][j];
    }
    System.out.println("A média do aluno "+ i + " é = " + (s / 4));
    
    }
}
}
