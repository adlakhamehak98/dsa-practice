package main.java.longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    //1mg R1
    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

        String firstStr = arr[0];
        String lastStr = arr[arr.length - 1];

        int index = 0;
        while (index < firstStr.length() && index < lastStr.length()) {
            if (firstStr.charAt(index) == lastStr.charAt(index)) {
                index++;
            } else
                break;
        }
        return firstStr.substring(0, index);
    }
}
