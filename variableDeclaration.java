import java.util.Date;

import java.awt.*;

public class variableDeclaration {
    public static void main(String[] args) {
        // Primitive variables
        byte age = 30;
        long viewCounts = 5_100_503_876L;
        int length = 187683;
        System.out.println(age);
        System.out.println(viewCounts);
        System.out.println(length);
        float price = 10.99f;
        char character = 'A';
        boolean isEligible = false;

        // reference variables
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        String message = new String("Hello World");
        System.out.println(message);

        String message2 = "Hello World" + "!!";
        System.out.println(message2);
        System.out.println(message2.endsWith("!!"));

        // check occurence of the string
        System.out.println(message.indexOf('H'));

        // replace
        System.out.println(message.replace('!', '*'));

        // .touppercase
        // .totrim --> for white spaces

        // learn string class

        // escape characters
        // single / for quotes
        // double // for single /
        // new line /n
        // tab space /t

    }
}
