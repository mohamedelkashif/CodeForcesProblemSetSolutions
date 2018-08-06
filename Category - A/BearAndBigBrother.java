import java.util.Scanner;
public class Main{
      public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int yearCount = 0;
        
        while(true){
            a = 3*a; //12 36
            b = 2*b; //14 28
            yearCount++; //1
            
            if(a > b){
                break;
            }
            
        }
        System.out.println(yearCount);
        
        
    }
}
