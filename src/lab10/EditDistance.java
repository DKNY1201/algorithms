package lab10;

/**
 * Created by Bi on 8/8/17.
 */
public class EditDistance {

    public static int editDistance(String A, String B) {
        int n = A.length();
        int m = B.length();

        int[][] table = new int[n + 1][m + 1];
        table[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            table[i][0] = i;
        }

        for (int j = 1; j <= m; j++) {
            table[0][j] = j;
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    table[i][j] = minOfTripple(table[i - 1][j], table[i - 1][j - 1], table[i][j - 1]) + 1;
                }
            }
        }

        return table[n][m];
    }

    public static int minOfTripple(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);
    }

    public static void main(String[] args) {
        System.out.println(editDistance("DUCK", "TUG"));
        System.out.println(editDistance("QUY", "GUYC"));
    }

}
