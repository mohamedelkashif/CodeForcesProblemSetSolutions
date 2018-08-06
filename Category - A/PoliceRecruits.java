import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum=0;
		int input = 0;
		int neg = 0;
		for(int i=0;i<n;i++){
		     input = sc.nextInt();
		     if(input > 0){
		          sum+=input;
		     }
		     else if(input < 0){
		          if(sum > 0){
		               sum--;
		          }
		          else
		               neg++;
		     }
		}
		System.out.println(neg);
     }
     
}
