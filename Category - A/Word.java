import java.util.Scanner;
import java.lang.*;
public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String val = input.nextLine();
        int capitalCounter = 0;
        int smallCounter = 0;
        for(int i =0;i<val.length();i++){
            if(Character.isUpperCase(val.charAt(i))){
                capitalCounter++;
            }
            else{
                smallCounter++;
            }
        }
        if(capitalCounter > smallCounter){
            System.out.println(val.toUpperCase());
        }
        else if(smallCounter > capitalCounter){
            System.out.println(val.toLowerCase());
        }
        else{
            System.out.println(val.toLowerCase());
        }
    }
}