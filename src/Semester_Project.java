import java.sql.SQLOutput;
import java.util.*;

public class Semester_Project {
    static Scanner sc = new Scanner(System.in);
    //first
    public static void greeting(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.print("Nice to meet you "+name+", where are you traveling to? ");
        String town_name = sc.nextLine();
        System.out.println("Great! "+town_name+" sounds like a great trip");
    }

    //second
    public static void travelTimeBudget(){
        System.out.print("How many days are you going to spend traveling? ");
        int travel_days = sc.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        int money = sc.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = sc.next();
        System.out.print("How many "+currency+" are there in 1 USD? ");
        double currency_in_USD = sc.nextDouble();
        int hours = travel_days*24;
        int minutes = hours*60;
        int seconds = minutes*60;
        System.out.print("\n"+"If you are traveling for "+travel_days+" days that is same as "+hours+" hours or "+minutes+" minutes or "+seconds+" seconds.");
        double money_per_day = money / (double)travel_days;
        money_per_day = Math.round(money_per_day * 100);
        money_per_day = money_per_day/100;
        System.out.print("If you are going to spend "+"$"+money+" USD that means per day you can spend up to $"+money_per_day+" USD\n");
        double currensed_money_per_day = Math.round(money_per_day*currency_in_USD*100);
        currensed_money_per_day = currensed_money_per_day/100;
        System.out.println("Your total budget in EUR is "+money*currency_in_USD+" "+currency+", which per day is "+currensed_money_per_day+" "+currency);
    }

    //third
    public static void timeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time_diff = sc.nextInt();
        int noon_at_home = time_diff;
        if((time_diff+12)>24) noon_at_home = (time_diff+12)%24 ;
        else noon_at_home=noon_at_home+12;
        System.out.println("That means that when it is midnight at home it will be "+time_diff+":00 "+" in your travel \n" +
                "destination and when it's noon at home it will be "+noon_at_home+":00");

    }

    //fourth
    public static void countryArea(){
        System.out.print("What is square area of your destination country in km2? ");
        double km_area = sc.nextInt();
        double miles = km_area*0.38610215854245;
        miles = (int)(miles*100);
        miles = miles/100;
        System.out.print("In miles2 that is "+miles);
    }

    //fifth
    public static void  vacation_plan(){
        System.out.print("How many places you traveled to :");
        int how_much = sc.nextInt();
        System.out.print("Enter the name: ");
        sc.next();
        System.out.println("Countries: Italy, England, Netherlands, Germany, France.");
        System.out.println("             0       1          2          3        4");
        System.out.print("Next place you want to travel to : ");
        int number = sc.nextInt();
        String country = "";
        switch (number){
            case 0:
                country="Italy";
                break;
            case 1:
                country="England";
                break;
            case 2:
                country="Netherlands";
                break;
            case 3:
                country="Germany";
                break;
            case 4:
                country="France";
                break;
            default:
                System.out.println("Restart and write number to choose");
        }
        System.out.println("Thank you, Your next location is :"+country);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //greeting();
        //travelTimeBudget();
        //timeDifference();
        //countryArea();
        vacation_plan();
    }


}
