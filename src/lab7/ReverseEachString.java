package lab7;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by Bi on 8/1/17.
 */
public class ReverseEachString {
    public static String reverseEeachString(String str) {
        String strings[] = str.split(" ");

        String[] resultStr = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < strings[i].length(); j++) {
                stack.push("" + strings[i].charAt(j));
            }

            String reverse = "";

            while (!stack.isEmpty()) {
                reverse += stack.pop();
            }

            resultStr[i] = reverse;
        }

        String result = "";

        for (String s: resultStr) {
            result += s + " ";
        }

        return result;
    }

    public static String reverse(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }

        String reverseStr = "";

        while (!stack.isEmpty()) {
            reverseStr += stack.pop();
        }

        String[] reverses = reverseStr.split(" ");

        String result = "";

        for (int i = reverses.length - 1; i >= 0 ; i--) {
            result += reverses[i] + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "we test coders";

        System.out.println(reverseEeachString(s));
        System.out.println(reverse(s));
    }
}


//Algorithm reverse(S)
//    Input A String S
//    Output A String with each element is reverted
//
//    stack <- new Stack
//    for i <- 0 to S.length - 1 do
//        stack.push(S.charAt(i))
//
//    reverseStr <- ""
//
//    while !stack.isEmpty() do
//        reverseStr <- reverseStr + stack.pop()
//
//    reverseStrArr = reverseStr.split(" ")
//
//    result <- ""
//
//    for i <- reverseStrArr.length - 1 to 0 do
//        result <- result + reverseStrArr[i] + " "
//
//    return result