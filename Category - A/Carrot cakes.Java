import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int k = in.nextInt();
        int d = in.nextInt();
        int g = (n+ (k-1)) / k;
        String ans = "";
        
        int noOfTimeToBakeNCakes = (n*t)/k;
        
        // if(n < k){
        //     ans = "NO";
        // }
        // else if(noOfTimeToBakeNCakes <= (t+d)){
        //     ans = "NO";
        // }
        // else{
        //     ans = "YES";
        // }
        // System.out.println(ans);
        int t1=0;int t2=d;
        int no = g*t;
        for(int i=0;i<g;i++){
            if(t1<=t2){
                t1+=t;
            }
            else{
                t2+=t;
            }
        }
        if(Math.max(t1, t2) < no){
            ans = "YES";
        }
        else{
            ans = "NO";
        }
        System.out.println(ans);
    }
}