import java.util.Scanner;

public class DailyCheckIn {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ask for name
        System.out.println("What is you name?");
        String name = scanner.nextLine();

        //Ask about the day
        System.out.println("On a scale of 1-5, how was your day?");
        int mood = scanner.nextInt();

        //Respond Based on mood
        if(mood <= 2){
            System.out.println(mood + "?" + " " + "Rough day champ, you'll get em next time" + " " + name);
        } else if (mood == 3){
        System.out.println(mood + "?" + " " + "A neutral day. We take those");
        } else {
            System.out.println("Nice one!" + " " + "a" + " " + mood + "?" + " " + "Glad you had a great day" + " " + name + "!");
        }

        //Final Message
        System.out.println("Thanks for checking in!");

        scanner.close();
    }
}