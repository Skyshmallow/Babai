import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arrString = new String[s.length()];
        int[] theirNum = new int[s.length()];
        int iter =0;
        while (s.length()!=0) {

            String res = "" + s.charAt(0);
            char previous = s.charAt(0);
            int length = s.length();
            int count = 0;
            for (int i = 1; i < length; i++) {
                char curr = s.charAt(i);
                if (curr > previous) {
                    res += curr;
                    count++;
                } else break;
            }
            //System.out.println("S "+s);
            s=s.substring(count+1);
            //System.out.println("Substringed s "+s);
            theirNum[iter]=count;
            arrString[iter]=res;
//            System.out.println("res "+res);
//            System.out.println("count "+count);
//            System.out.println("iter "+iter+"\n");
            iter++;
        }

        int max=0;
        for (int i = 0; i < iter; i++) {
            max=Math.max(max,theirNum[i]);
        }

        for (int i = 0; i < iter; i++) {
            if(theirNum[i]==max){
                System.out.println(arrString[i]);
                break;
            }
        }

    }
}


