import java.util.Scanner; 
import java.lang.Math;
import java.text.DecimalFormat;

public class TheatreSquare{
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]){
        double m = sr.nextInt();
        double n = sr.nextInt();
        double a = sr.nextInt();
        DecimalFormat df = new DecimalFormat("###.#");
     
        System.out.println(df.format(Math.ceil(m/a) *  Math.ceil(n/a)));
    }
}
