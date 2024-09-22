import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1. Введите числа x и y: ");
        x = in.nextInt();
        y = in.nextInt();
        solve1(x, y);

        System.out.println("Задание 2. Введите числа x и y: ");
        x = in.nextInt();
        y = in.nextInt();
        solve2(x, y);

        System.out.println("Задание 3. Введите x: ");
        x = in.nextInt();
        solve3(x);
    }

    public static void solve1(int x, int y){
        double answer = 0;
        if (x > y)
            answer = (double) y / 10;
        else
            answer = (double) x / 10;
        System.out.println("Овет: " + answer);
    }

    public static void solve2(int x, int y){
        int answer = 0;
        int max = max(x, y);
        int min = min(x, y);

        answer = (5 * max - 4 * min) / (3 + ( max / min));
        System.out.println("Ответ: max = " + max + " min = " + min + " d = " + answer);
    }

    private static void solve3(int x) {
    double Y = 0, F = 0;

    if (x <= -2)
        Y = pow(x, 5) + 1;
    else if (-2 < x && x <= 1)
        Y = 3 * x * (1 + exp(x+1));
    else if(x > 1)
        Y = pow(sin(x), 5);

    if (x <= -2)
        F = exp(sin(x));
    else if (-2 < x && x <= 1)
        F = pow(x, 4);
    else if(x > 1)
        F = sqrt(cos(x));

    System.out.println("Ответ: Y = " + Y + " F = " + F);
    }

    private static int max(int x, int y) {
        y +=2;
        return Math.max(x, y);
    }

    private static int min(int x, int y) {
        x = 1 - x;
        return Math.min(x, y);
    }
}