import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Decide if the flag is true or false (t/f): ");
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        int number = 0;
        
       
        String userInput = scanner.nextLine();
        if (userInput.equals("t")) {
            flag = true;
            scanner.close();
        } 
        else if (userInput.equals("f")) {
            flag = false;
            scanner.close();
        }
        else {
            System.out.println("Need to use a t or f to assign true or false" );
            scanner.close();
            return;
        }
        
        if (flag) {
            number = 12;
        }
        else {
            number = 5;
        }
        System.out.println(number);
    }
}
