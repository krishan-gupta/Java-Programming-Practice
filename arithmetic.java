import java.text.NumberFormat;

public class arithmetic {
    public static void main(String[] args) {
        int result = 10 + 4;
        result++;
        System.out.println(result);

        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 2;
        int y = x + 2;
        System.out.println(y);

        String x1 = "1";
        int y1 = Integer.parseInt(x1) + 2;
        System.out.println(y1);

        int res = Math.round(1.1F);
        System.out.println(res);

        // ceil , floor
        // max btw 2 numbers

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resulta = currency.format(1234567.892);
        System.out.println(resulta);

    }
}
