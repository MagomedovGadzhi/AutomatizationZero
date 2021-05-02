package lesson2.task4;

import lesson2.task1.Array;

import java.util.Arrays;

public class TwoStrings {
    public static void main(String[] args) {
        String [] word1 = {"hello", "ping", "qwer", "post"};
        String [] word2 = {"world", "pong", "asdf", "get"};
        String [] result= {"", "", "", ""};

        for (int index = 0; index < word1.length; index++) {
            char[] arrayWord1 = word1[index].toCharArray();
            Arrays.sort(arrayWord1);

            for (char temp : arrayWord1) {
                String symbol = String.valueOf(temp);
                if (result[index].contains(symbol)) continue;
                if (word2[index].contains(symbol)) result[index] = result[index] + symbol;
            }

            System.out.println(result[index]);
        }
    }
}
