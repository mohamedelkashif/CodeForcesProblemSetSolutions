import java.util.Scanner; 
public class Main{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);  
          String word = sc.nextLine();
          char[] chars = word.toCharArray();
          int upeerCount = 0;
          int lowerCount = 0;
          for(int i=0;i<chars.length;i++){
               if(Character.isUpperCase(chars[i]) == true){
                    upeerCount++;
               }
               else if(Character.isLowerCase(chars[i]) == true){
                    lowerCount++;
               }
             
               
               
          }
            if(lowerCount > upeerCount){
                    System.out.println(word.toLowerCase());
               }
               else if(lowerCount < upeerCount){
                    System.out.println(word.toUpperCase());
               }
               else{
                    System.out.println(word.toLowerCase());
               }
          
     }
}
