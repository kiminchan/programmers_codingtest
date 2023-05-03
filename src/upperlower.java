import java.util.Scanner;
import java.util.*;


public class upperlower {

    public static void main(String[] args) {
        String output = "";
        char tmp;
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            tmp = a.charAt(i);
            if ((65 <= tmp) && (tmp <= 90)) {
                output += a.valueOf(tmp).toLowerCase();
            } else if ((97 <= tmp) && (tmp < 122)) {
                output += a.valueOf(tmp).toUpperCase();
            } else {
                output += (char) tmp;
            }
        }
        System.out.println(output);

    }
}