import java.util.Scanner;

public class Kurs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int kolichestvo = sc.nextInt();
        int time_to_reach = sc.nextInt();
        int spent = 0;
        int total_time = 240 - time_to_reach;
        // System.out.println(total_time);
        int cnt = 0;
        for (int i = 1; i <= kolichestvo; i++) {
            if (total_time < i * 5) {
                break;
            }
            cnt++;
            total_time -= i * 5;
        }
        System.out.println(cnt);
    }
}
