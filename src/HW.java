import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String given = sc.nextLine();
        String find = sc.nextLine();
        int count = find.length();

        for (int i = 0; i < given.length(); i++) {
            int a =0;
            if(given.charAt(i)==find.charAt(a)){
                for (int j = 0; j < find.length(); j++) {
                    if(given.charAt(i+1 )==find.charAt(a)) count++;
                    a++;
                }
            }
        }


    }
}
