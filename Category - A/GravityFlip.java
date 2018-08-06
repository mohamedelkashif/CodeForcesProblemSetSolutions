import java.util.Scanner;
import java.util.Arrays;
public class Main{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          
          int x = sc.nextInt();
          int arr [] =new int[x];
          String str =  "";
          for(int i=0;i<x;i++){
               arr[i] = sc.nextInt();
               
          }
          Arrays.sort(arr);
          for(int j=0;j<x;j++){
               str += arr[j] + " ";
          }
          System.out.println(str.trim());
     }
}
