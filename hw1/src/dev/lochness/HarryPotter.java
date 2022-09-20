package dev.lochness;

import static java.lang.Math.*;

public class HarryPotter {

    public static void main(String[] args) {
        int N = 25;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(
                        cos(x) > sin(x)
                                ? "#"
                                : ".");
            }
            System.out.println();
        }
    }
}
