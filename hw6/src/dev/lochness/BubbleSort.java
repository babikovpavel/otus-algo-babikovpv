package dev.lochness;

public class BubbleSort {

    public static void main(String[] args) {
        int[] source = new int[]{543, 1, 6, 3, 432, 4234, 243};
        boolean swap;
        for (int i = 0; i < source.length - 1; i++) {
            swap = false;
            for (int j = 0; j < source.length - i - 1; j++) {
                if (source[j] > source[j + 1]) {
                    int max = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = max;
                    swap = true;
                }
            }
            printArray(source);
            if(!swap) break;
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
