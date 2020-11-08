import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    int i;
    int j;
    
    for(i=1, j=60; j>=0; i = i + 3, j= j - 5){
    System.out.println("I="+i+" J="+j);
    }
}
}
