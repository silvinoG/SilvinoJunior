import java.util.Scanner;
public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int t;
    int d = 0;
    int m = 0;
    int p = 0;
    int s = 0;
    int y = 0;
    int c = 0;
    
    t = sc.nextInt();
    
    for(int i=0; i<t; i++){
    
    p = sc.nextInt();
        
    if(p % 2 == 0){ 
        s++;
    }
    if(p % 3 == 0){
       d++;
    }
    if(p % 4 == 0){
        y++;
    }
    if(p % 5 == 0){
        c++;
    }
    }
     System.out.println(s+" Multiplo(s) de 2");
     System.out.println(d+" Multiplo(s) de 3");
     System.out.println(y+" Multiplo(s) de 4");
     System.out.println(c+" Multiplo(s) de 5");
}
}
