import static java.lang.Math.*;

public class solve3 {
    int x = 0;
    public solve3(int x){
        this.x = x;
    }
    public void solve(int x) {
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
            F = pow(cos(x), 0.5);

        System.out.println("Ответ: Y = " + Y + " F = " + F);
    }


}
