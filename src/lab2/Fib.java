package lab2;

/**
 * Created by Bi on 7/26/17.
 */
public class Fib {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int result = 0;

        int pre1 = 1;
        int pre2 = 0;

        for (int i = 2; i < n; i++) {
            int temp = pre1;
            pre1 += pre2;
            pre2 = temp;
            result = result + pre1 + pre2;
        }

        result = pre1 + pre2;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib2(6));
    }
}


//Algorithm IterativeFib(n)
//	Input: A non-negative integer n
//    Output: n!
//
//    if n = 0 | n = 1 then
//        return n
//
//    preOne <- 1
//    preTwo <- 0
//
//    for i <- 2 to n - 1 do
//        temp <-	preOne
//        preOne <- preOne + preTwo
//        preTwo <- temp
//
//    return preOne + preTwo