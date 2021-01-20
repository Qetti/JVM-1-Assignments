package Assignment1.Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int b;
    private static int a;

    int evenQuantity = 0;
    int oddQuantity = 0;
    int evenSum = 0;
    int oddSum = 0;

    int[] arr = new int[40];

    public static void main(String[] args) {
        Main ab = new Main();
        ab.setValues();
        ab.checkValues(a, b);

        ab.checkEvenOrOdd();
        ab.printSumResults();
        ab.checkValues(ab.evenSum, ab.oddSum);
        System.out.println(ab.result());

    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
    }

    public void checkValues(int a, int b){
        if(a>b){
            setRange(a, b);
        }
        else{
            createNumsArray(b, a);
        }
    }

    public void setRange(int a, int b){
        // Changing values of a and b
        a = a + b;
        b = a - b;
        a = a - b;
        createNumsArray(a, b);
    }

    public void createNumsArray(int a, int b){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (a - b)) + b);
        }
    }

    public void checkEvenOrOdd(){
        for(int num : arr){
            if(num%2 == 0){
                evenQuantity += 1;
                evenSum += num;
            }
            else {
                oddQuantity += 1;
                oddSum += num;
            }
        }
    }

    public void printSumResults(){
        System.out.println("Random numbers array: " + Arrays.toString(arr));
        System.out.println("Quantity of EVEN numbers: " + evenQuantity);
        System.out.println("Sum of EVEN numbers: " + evenSum);
        System.out.println("Quantity of ODD numbers: " + oddQuantity);
        System.out.println("Sum of ODD numbers: " + oddSum);
    }

    public String result() {
        int[] newArr = new int[5];
        for (int i = 0; i < 5; i++) {
            int rnd = new Random().nextInt(arr.length);
            newArr[i] = arr[rnd];
        }
        return "Random 5 numbers from new range: " + Arrays.toString(newArr);
    }
}

