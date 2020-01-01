import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
 
        HashSet<Character> valid = new HashSet<Character>();
        for(int i = 0;i<input.length();i++){
            if(!(input.charAt(i) == '{' || input.charAt(i) == '}' || input.charAt(i) == ',' || input.charAt(i) == ' ')){
                valid.add(input.charAt(i));
            }
        }
        System.out.println(valid.size());
    }
}