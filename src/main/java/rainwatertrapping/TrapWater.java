package main.java.rainwatertrapping;

public class TrapWater {

    //brute force approach, freecharge R1 interview question
    public static int trappedWater(int[] arr, int length) {
        int amount = 0;

        for (int i = 1; i < length - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j = i + 1; j < length; j++) {
                right = Math.max(right, arr[j]);
            }


            amount += Math.min(left, right) - arr[i];

        }
        return amount;
    }

//    int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//    int length = arr.length;
//    System.out.println(trappedWater(arr, length));
}
