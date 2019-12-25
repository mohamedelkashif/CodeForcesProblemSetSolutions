import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int events = in.nextInt();
        int count = 0;
        int policeMan = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<events;i++){
            arr.add(in.nextInt());
        }
        
        
        
       for(int i=0;i<events;i++){
            if(arr.get(i) == -1){
                if(policeMan > 0){
                    policeMan--;
                }
                else
                    count++;
            }
            else if(arr.get(i) > 0) {
                policeMan+=arr.get(i);
            }
        }
        System.out.println(count);
    }
}