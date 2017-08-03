package lab8;

/**
 * Created by Bi on 8/2/17.
 */
public class IsPrime {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }
//Algorithm
//    Input An integer n
//    Output True if n is prime otherwise 0
//
//    if n < 2 then
//		return false
//    if n = 2 then
//		return true
//    if n % 2 = 0
//        return false
//
//    for i <- 3 to sqrt(n) do
//        if n % i = 0 then
//			return false
//        i <- i + 2
//
//    return true
}
