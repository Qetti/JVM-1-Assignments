package Task1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static ArrayList<Integer> divisible_on_7 = new ArrayList<>();
    public static void main(String[] args) {

        for(int i=10; i < 5000; i++){
            if(countDivisors(i) == 2 && i % 7 == 0) {
                divisible_on_7.add(i);
            }
        }
        write_in_file();
    }
    static int countDivisors(int n)
    {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;

                else
                    cnt = cnt + 2;
            }
        }
        return cnt - 2;
    }
    static void write_in_file(){
        try{
            FileWriter file = new FileWriter("FirstTaskResults.txt",true);
            PrintWriter pw = new PrintWriter(file);
            for (Integer integer : divisible_on_7) {
                pw.println(integer);
            }
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}