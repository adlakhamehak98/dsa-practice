package main.java.rainWaterTrapping;

public class TrapWater {

    //brute force appproach, freecharge R1 interview question
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
}
