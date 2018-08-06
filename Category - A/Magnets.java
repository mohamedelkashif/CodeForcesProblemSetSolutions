import java.util.Scanner;

public class Main{
     public static void main(String[] args)  {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);  
		 int n = sc.nextInt();
		 int [] mag = new int[n];

		 int count = 0;
		 
         for(int i=0;i<mag.length;i++){
        	 mag[i] = sc.nextInt();
         }
         int b= 0;
         for(int i=0;i<mag.length;i++){
        	// for(int j=i+1;j<mag.length;j++){
        		 if(mag[i] != b){
            		 count++;
            		 b=mag[i];
            	 } 
        	// }
        	
        	 //System.out.println(mag[i]);
         }
         System.out.println(count);
         
         

	}
     
}
