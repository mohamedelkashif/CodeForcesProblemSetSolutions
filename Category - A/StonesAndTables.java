import java.util.Scanner;
public class Main{
          public static void main(String[] args) {
     		Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt();
     		sc.nextLine();
     		String str = sc.nextLine();
     		int count = 0;
     		char last =str.charAt(0);
     		for(int i=1;i<str.length();i++) {
     			if(str.charAt(i) == last) {
     				count++;
     			}
     			else
     				last = str.charAt(i);
     		}
     		System.out.println(count);

	}

}
