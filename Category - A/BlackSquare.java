import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
     public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in);
        int firstSum=0;
        int secondSum = 0;
        int thirdSum=0;
        int fourthSum=0;
        int num=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<4;i++){
        	//arr[i] = sc.nextInt();
        	num = sc.nextInt();
            list.add(num);
        }
       sc.nextLine();
       String str = sc.nextLine();
       char [] chars = str.toCharArray();
       for(int i=0;i<chars.length;i++){
    	   if(chars[i] == '1'){
    		   firstSum+=list.get(0);
    	   }
    	   else if(chars[i] == '2'){
    		   secondSum+=list.get(1);
    	   }
    	   else if(chars[i] == '3'){
    		   thirdSum+=list.get(2);
    	   }
    	   else if(chars[i] == '4'){
    		   fourthSum+=list.get(3);
    	   }
       }
         System.out.println(firstSum+secondSum+thirdSum+fourthSum);
	}

}
