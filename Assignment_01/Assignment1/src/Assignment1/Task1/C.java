package Assignment1.Task1;

// განსაზღვრეთ კლასი C: სამი მთელი ტიპის ცვლადით a, b, c; 6 მეთოდით;


import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        C c = new C();
        c.SetValues();
        System.out.println("Method 2: Last digit of number a: " + c.aLastDigit());
        System.out.println("Method 3: First digit of number b: " + c.bFirstDigit());
        System.out.println("Method 4: Sum of number c's digits: " + c.cSumOfDigits());
        System.out.println("Method 5: Multiple of method 2 and method 3: " + c.MultiplicationOfMethods());
        c.SumOfMethods();
    }

    int a;
    int b;
    int c;

    // მეთოდი 1: ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან
    public void SetValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        this.a = sc.nextInt();
        System.out.println("Enter b: ");
        this.b = sc.nextInt();
        System.out.println("Enter c: ");
        this.c = sc.nextInt();
    }


    // მეთოდი 2: აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს
    public int aLastDigit(){
        return this.a%10;
    }


    // მეთოდი 3: აბრუნებს b-ს მნიშვნელობის პირველ ციფრს
    public int bFirstDigit(){
        int n = this.b;
        while (n>9){
            n /= 10;
        }
        return n;
    }


    // მეთოდი 4: აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს
    public int cSumOfDigits(){
        int n = this.c;
        int sum = 0;
        int length = String.valueOf(n).length();
        for(int i = 0; i < length; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    // მეთოდი 5: ბეჭდავს მეთოდი 2-ის მნიშნველობისა და მეთოდი 3-ის მნიშვნელობის ნამრავლს
    public int MultiplicationOfMethods(){
        return this.aLastDigit() * bFirstDigit();
    }


    // მეთოდი 6: ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის მნიშვნელობის ჯამს
    public void SumOfMethods(){
        System.out.println("Method 6: Sum of method 3 and method 5: " + (this.bFirstDigit() + MultiplicationOfMethods()));
    }
}


