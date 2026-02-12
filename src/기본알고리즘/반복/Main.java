package 기본알고리즘.반복;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("sum = " + sum());
        System.out.println("sumof = " + sumof());
        System.out.println("sumVerBose09 = " + sumVerBose09());
        System.out.println("sumVerBose10 = " + sumVerBose10());
        multiplicationTable();
        additionTable();
        squareTable();
        triangleLB();
        triangleLU();
        triangleRU();
        triangleRB();

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

    // Q11
    public static void multiplicationTable() {

        // 헤더
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        // 구분선
        System.out.print("---+");
        System.out.print("---".repeat(9));
        System.out.println();

        // 본문
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }

    // Q12
    public static void additionTable() {

        // 헤더
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        // 구분선
        System.out.print("---+");
        System.out.print("---".repeat(9));
        System.out.println();

        // 본문
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }

    // Q13
    public static void squareTable() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이: ");
        int f = sc.nextInt();

        for (int i = 0; i < f; i++) {
            System.out.println("*".repeat(f));
        }
    }

    // Q14
    public static void triangleLB() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Q14
    public static void triangleLU() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Q14
    public static void triangleRU() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Q14
    public static void triangleRB() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

/*
    // 코드 개선
    public static void printTriangle(int n, Direction direction) {

        for (int i = 1; i <= n; i++) {

            switch (direction) {

                case LEFT_BOTTOM:
                    System.out.println("*".repeat(i));
                    break;

                case LEFT_TOP:
                    System.out.println("*".repeat(n - i + 1));
                    break;

                case RIGHT_BOTTOM:
                    System.out.println(" ".repeat(n - i) + "*".repeat(i));
                    break;

                case RIGHT_TOP:
                    System.out.println(" ".repeat(i - 1) + "*".repeat(n - i + 1));
                    break;
            }
        }
    }
*/
}
