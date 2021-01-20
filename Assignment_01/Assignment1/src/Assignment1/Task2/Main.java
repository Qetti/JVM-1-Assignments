package Assignment1.Task2;


public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.setValue();
        a.sum();
        a.oddOrEven();

        B b = new B();
        b.setValue();
        System.out.println(b.sumOfXY(a.x));
    }
}
