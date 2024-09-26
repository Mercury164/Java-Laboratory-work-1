public class solve1 {
    int x, y;

    public solve1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void solve(int x, int y){
        double answer = 0;
        if (x > y)
            answer = (double) y / 10;
        else
            answer = (double) x / 10;
        System.out.println("Овет: " + answer);
    }
}
