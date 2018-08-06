import java.util.Scanner; 
public class Main{
     public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       
       String a= sc.nextLine();
       String b = sc.nextLine();
       
       a=a.toLowerCase();
       b=b.toLowerCase();
       int n = a.compareTo(b);
       
       if(n == 0){
            System.out.println("0");
       }
       else if(n > 0){
            System.out.println("1");
       }
       else
          System.out.println("-1");
     }
}
