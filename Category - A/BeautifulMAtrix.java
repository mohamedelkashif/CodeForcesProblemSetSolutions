import java.util.Scanner;
import java.lang.Math;
public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int arr [][] = new int[5][5];
          int a=0;
          int b=0;
          for(int i=0;i<5;i++){
               for(int j=0;j<5;j++){
                    arr[i][j] = sc.nextInt();
                    
               }
          }
          for(int i=0;i<5;i++){
               for(int j=0;j<5;j++){
                    if(arr[i][j] == 1){
                         a = Math.abs(3-(i+1));
                         b= Math.abs(3-(j+1));
                    }
                    
               }
               
          }
          System.out.println(a+b);
          
     }
}
