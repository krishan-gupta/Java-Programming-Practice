import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            byte age = scanner.nextByte();
            System.out.println("You are " + age);

            String name = scanner.next(); // reads one token
            System.out.println(name);

            String fullname = scanner.nextLine(); // reads one line
            System.out.println(fullname);

            // scanner.nextLine().trim() reads the line by removing all white spaces
        }

    }
}
