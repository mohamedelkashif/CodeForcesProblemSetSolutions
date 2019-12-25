import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int cards = in.nextInt();
        int sCount = 0;
        int dCount=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<cards;i++){
            arr.add(in.nextInt());
        }
        boolean sBool = true;
        boolean dBool = true;
        for(int i=0;i<cards;i++){
            if(sBool == true){
                if(arr.get(0) < arr.get(arr.size()-1)){
                    sCount = sCount + arr.get(arr.size() - 1);
                    sBool = false;
                    arr.remove(arr.size() - 1);
                }
                else if(arr.get(0) > arr.get(arr.size()-1)){
                    sCount = sCount+ arr.get(0);
                    sBool = false;
                    arr.remove(0);
                }
                else{
                    sCount = sCount + arr.get(0);
                }
            }
            else if(sBool == false) {
                if(arr.get(0) < arr.get(arr.size()-1)){
                    dCount = dCount + arr.get(arr.size() - 1);
                    sBool = true;
                    arr.remove(arr.size() - 1);
                }
                else if(arr.get(0) > arr.get(arr.size()-1)){
                    dCount = dCount+ arr.get(0);
                    sBool = true;
                    arr.remove(0);
                    
                }
                
                else{
                    dCount = dCount + arr.get(0);
                }
            }
            
        }
        System.out.println(sCount + " " + dCount);
    }
}