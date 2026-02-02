package 기본알고리즘.반복;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("sum = " + sum());
        System.out.println("sumof = " + sumof());
        System.out.println("sumVerBose09 = " + sumVerBose09());
        System.out.println("sumVerBose10 = " + sumVerBose10());

    }

    public static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n = ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        return sum;
    }

    // 가우스의 덧셈
    public static int sumof() {
        Scanner sc = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        return ( max + min ) * ( max - min + 1) / 2;
    }

    // Q9
    public static int sumVerBose09() {
        Scanner sc = new Scanner(System.in);

        System.out.println("d - c를 출력합니다.");
        System.out.print("c = ");
        int c = sc.nextInt();

        int d = 0;
        do {
            System.out.print("d = ");
            d = sc.nextInt();
        } while (d <= c);

        return d - c;
    }

    // Q10
    public static String sumVerBose10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("e = ");
        int e = sc.nextInt();

        int r = 0;
        while (e > 0) {
            e = e / 10;
            r++;
        }
        return "그 수는 " + r + "자리입니다.";
    }
}
