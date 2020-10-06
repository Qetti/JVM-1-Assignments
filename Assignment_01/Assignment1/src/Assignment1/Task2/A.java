package Assignment1.Task2;

import java.util.Scanner;

public class A {

    int x;

    // კონსტრუქტორი 1: ბეჭდავს „Hello“;
    public A() {
        System.out.println("Hello");
    }

    // მეთოდი 1: შეაქვს x ცვლადში მონაცემი კლავიატურიდან;
    public void setValue() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }

    // მეთოდი 2: ბეჭდავს x+12-ს;
    public void sum() {
        System.out.println("Method 2: " + (x + 12));
    }

    // მეთოდი 3: ადგენს x ლუწია თუ კენტი;
    public void oddOrEven() {
        if (x % 2 == 0) {
            System.out.println("Method 3: X is even");
        } else {
            System.out.println("Method 3: X is odd");
        }
    }
}




