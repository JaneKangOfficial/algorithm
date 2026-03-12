package 기본알고리즘.배열.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandQ1 {

    public static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = 1 + rand2.nextInt(5);
        System.out.println("사람 수: " + num);

        int[] height = new int[num];
        System.out.println("키값은 아래와 같습니다.");

        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
