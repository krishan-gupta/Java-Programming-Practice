import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        int[] newNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(newNum));

        final float pi = 3.14F;// final is just like constant
        System.out.println(pi);

    }
}
