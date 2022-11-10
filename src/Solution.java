import java.util.*;

public class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int x = 0;
        int y = 0;
        int countx = 0;
        int county = 0;
        while(true){
            if(x<n){
                x+=a;
                countx++;
            }
            else break;
        }

        while(true){
            if(y<(m-a)){
                y+=a;
                county=(countx);
            }
            else break;
        }
        System.out.println(countx+county);
    }
}





