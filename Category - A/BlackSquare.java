import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        
        int count = 0;
        
        in.nextLine();
        String str = in.nextLine();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count += a1;
            }
            if(str.charAt(i) == '2'){
                count += a2;
            }
            if(str.charAt(i) == '3'){
                count += a3;
            }
            if(str.charAt(i) == '4'){
                count += a4;
            }
        }
        System.out.println(count);
    }
}