import java.util.Scanner;

public class userInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character

        System.out.println("Enter your username ");
        String name = scanner.nextLine();

        int age = 2021 - yearOfBirth;
       
        System.out.println("Your name is " + name + " and your are " + age + "years old ");

        scanner.close();

    }
    
}
