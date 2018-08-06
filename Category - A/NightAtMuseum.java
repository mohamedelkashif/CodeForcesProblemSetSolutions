import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstDistance = 0;
		int secondDistance = 0;
		int finalAnswer = 0;
		String str = sc.nextLine();
		char strChars [] = str.toCharArray();
		char ch = 'a';
		char [] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
		for (int i = 0; i < strChars.length; i++) {
			firstDistance = Math.abs(strChars[i] - ch);
			secondDistance = 26 - firstDistance;
			if(secondDistance < firstDistance) {
				finalAnswer += secondDistance;
			}
			else
				finalAnswer += firstDistance;
			ch = strChars[i];
		}
		System.out.println(finalAnswer);
	}
}
