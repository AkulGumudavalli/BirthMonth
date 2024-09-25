import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your birth month");
        double birthMonth = input.nextInt();
        if(birthMonth > 12){
            System.out.println("You entered an incorrect month value: "+ birthMonth);
        }
        else{
            System.out.println("Your birth month is: "+ birthMonth);
        }


    }
}