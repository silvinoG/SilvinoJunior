import java.util.Scanner;
public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int n;
    int a;
    int b;
    int s = 0;
      
    n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
      a = sc.nextInt();
      b = sc.nextInt();
    
    if(a >= 0 && b <= 5){  
    s = a + b;
      
    if(s == 0){
        System.out.println("PROXYCITY");
    }else
        if(s == 1){
            System.out.println("P.Y.N.G.");
        }else
            if(s == 2){
                System.out.println("DNSUEY!");
            }else
                if(s == 3){
                    System.out.println("SERVERS");
                }else
                    if(s == 4){
                        System.out.println("HOST!");
                    }else
                        if(s == 5){
                            System.out.println("CRIPTONIZE");
                        }else
                            if(s == 6){
                                System.out.println("OFFLINE DAY");
                            }else
                                if(s == 7){
                                    System.out.println("SALT");
                                }else
                                    if(s == 8){
                                        System.out.println("ANSWER!");
                                    }else
                                        if(s == 9){
                                            System.out.println("RAR?");
                                        }else
                                            if(s == 10){
                                                System.out.println("WIFI ANTENNAS");
                                            }
                }
            }
        }
    }
