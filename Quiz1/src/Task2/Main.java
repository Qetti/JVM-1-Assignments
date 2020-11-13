package Task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;

        ArrayList<Double> arr = new ArrayList<Double>();
        try {
            FileReader fr = new FileReader("results.txt");

            Scanner input = new Scanner(fr);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                double x = Double.parseDouble(line);
                arr.add(x);
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
        ArrayList<Double> newArr = new ArrayList<Double>();
        for (int counter = 0; counter < arr.size(); counter++) {
            if(arr.get(counter) >= 0){
                newArr.add(arr.get(counter));
            }
                System.out.println(arr.get(counter));
        }

        ArrayList<Double> newArr2 = new ArrayList<Double>();

        for (int counter2 = 0; counter2 < arr.size(); counter2++) {
            if(arr.get(counter2) >= -2 && arr.get(counter2) <= 2){
                sum += arr.get(counter2);
                newArr2.add(arr.get(counter2));
            }
            System.out.println(arr.get(counter2));
        }

        Collections.sort(arr);
        Collections.sort(newArr);


        System.out.println("უარყოფითებში მინიმუმი : " + arr.get(0));
        System.out.println("დადებითებში მინიმუმი : " + newArr.get(0));
        System.out.println("საშუალო [-2; 2] შუალედში : " + String.format(" %.2f", sum/newArr2.size()));
    }
}

