import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int shovelPrice = in.nextInt();
        int r = in.nextInt();
        int ans = 0;
        ArrayList<Integer> answer1 = new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            if((shovelPrice*i) % 10 == r){
                ans = i;
                answer1.add(i);
            }
            else if((shovelPrice*i) % 10 == 0){
                ans = i;
                answer1.add(i);
            }
            
        }
        Collections.sort(answer1);
        System.out.println(answer1.get(0));
    }
}