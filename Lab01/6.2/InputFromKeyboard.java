import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What's your name? : ");
        String strName = keyboard.nextLine();
        System.out.print("What's your age ? : ");
        int age = keyboard.nextInt();
        System.out.print("What's your height ? : ");
        double height = keyboard.nextDouble();

        System.out.println("Mrs/Ms. " + strName + " is " + age + " years old." + " Your height is " + height +".");




    }
}