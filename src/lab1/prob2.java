package lab1;

/**
 * Created by Bi on 7/25/17.
 */
public class prob2 {
    public static void main(String[] args) {
        System.out.println(gcd(45,9));
    }

    static int gcd(int m, int n) {
        if (m > n) {
            for (int i = n; i > 1; i--) {
                if (n % i == 0 && m % i == 0) {
                    return i;
                }
            }
        }

        for (int i = m; i > 1; i--) {
            if (m % i ==0 && n % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
