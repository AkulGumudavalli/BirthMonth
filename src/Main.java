import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // num birthMonth
        int birthMonth;
        //Output "What is your birth month"
        System.out.println("What is your birth month");
        if(input.hasNextInt()) {
            //Input birthMonth
            birthMonth = input.nextInt();
            //if birthMonth > 12 then
                //Output "You entered an incorrect month value: " + birthMonth
            if (birthMonth > 12) {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
            //else
                //Output "Your birth month is: " + birthMonth
            else {
                System.out.println("Your birth month is: " + birthMonth);
            }
            //endif

        }
    }
}