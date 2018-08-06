import java.util.Scanner;

public class Problem677A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int h = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a > h){
                sum+=2;
            }
            else if(a <= h){
                sum++;
            }
           
        }
         System.out.println(sum);
      
    }
}
