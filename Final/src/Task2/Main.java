package Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ რიცხვი: ");
        int userNumber = scanner.nextInt();

        LinkedList<Integer> newList = main.getArray(list, userNumber);
        main.oneChar(newList);
        main.twoChar(newList);
        main.threeChar(newList);
    }

    public LinkedList<Integer> getArray(LinkedList<Integer> list, int n){
        while (n > 0){
            list.push(n % 10);
            n = n / 10;
        }
        return list;
    }

    public void oneChar(LinkedList<Integer> list){
        WriteToFile(list.get(new Random().nextInt(list.size())));
    }

    public void twoChar(LinkedList<Integer> list){
        StringBuilder result = new StringBuilder();
        LinkedList<Integer> newList = new LinkedList<>();
        for(int i=0; i<3; i++){
            newList.add(list.get(new Random().nextInt(list.size())));
        }
        for(int k: newList){
            result.append(k);
        }
        int intResult = Integer.parseInt(String.valueOf(result));
        WriteToFile(intResult);
    }

    public void threeChar(LinkedList<Integer> list){
        Collections.sort(list);
        Collections.shuffle(list);

        StringBuilder result = new StringBuilder();
        for(int k: list){
            result.append(k);
        }
        int intResult = Integer.parseInt(String.valueOf(result));
        WriteToFile(intResult);
    }


    public void WriteToFile(int data){
        File file = new File("file.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(data + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
    }
}
