package Assignment1.Task2;

import java.util.Scanner;

public class B extends A {
    int y;

    public void setValue() {
        Scanner sc = new Scanner(System.in);
        this.y = sc.nextInt();
    }

    public int sumOfXY(int x) {
        return y + x;
    }
}
