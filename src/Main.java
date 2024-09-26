import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0;

        solve1 result1 = new solve1(x, y);
        solve2 result2 = new solve2(x, y);
        solve3 result3 = new solve3(x);

        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1. Введите числа x и y: ");
        x = in.nextInt();
        y = in.nextInt();

        result1.solve(x, y);

        System.out.println("Задание 2. Введите числа x и y: ");
        x = in.nextInt();
        y = in.nextInt();
        result2.solve(x, y);

        System.out.println("Задание 3. Введите x: ");
        x = in.nextInt();
        result3.solve(x);
    }


}