import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String val = input.nextLine();

        ArrayList unique = new ArrayList();
        for (int i = 0; i < val.length(); i++) {
            if (!unique.contains(val.charAt(i))) {
                unique.add(val.charAt(i));
            }
        }
        if (unique.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }

}
