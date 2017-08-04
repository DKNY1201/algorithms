package leetcode;

/**
 * Created by Bi on 8/2/17.
 */
public class ReverseInteger {

    public static int reverse(int n) {
        int reverse = 0;

        while (n != 0) {
            int x = n % 10;
            int temp = reverse * 10 + x;

            if ((temp - x) / 10 != reverse) {
                return 0;
            }

            reverse = temp;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
}
