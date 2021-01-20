package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.PlayGame();
    }

    public void PlayGame() throws IOException {
        int money = 100;
        while (true){
            int sum = 0;
            System.out.println("თამაშის დასაწყებად შეიყვანეთ Y, შესაწყვეტად შეიყვანეთ N! ");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();
            if(userChoice.equals("Y")){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int[][] nums = new int[5][3];
                int i, j;
                String num;
                System.out.println("შეიყვანეთ თითო ციფრი თითოეულ ხაზზე: ");
                for (i = 0; i <=4; i++){
                    for(j=0; j<=2; j++){
                        num = bufferedReader.readLine();
                        nums[i][j] = Integer.parseInt(num);
                    }
                }
                System.out.println("შემთხვევითი რიცხვებია: ");
                for(i = 0; i<=4; i++){
                    for(j=0; j <= 2; j++){
                        System.out.print(nums[i][j] + "\t" );
                        sum += nums[i][j];
                    }
                    System.out.println();
                }

                System.out.println("შემთხვევითი რიცხვების ჯამია: " + sum);
                System.out.println();

                if(sum > 0){
                    System.out.println("თქვენ მოიგეთ და გაქვთ: " + (money + 5 ) + "ლარი");
                    money += 5;
                }
                else{
                    System.out.println("თქვენ წააგეთ და გაქვთ " + (money - 5) + "ლარი");
                    money -= 5;
                }
                System.out.println();
            }
            else if(userChoice.equals("N")){
                System.out.println("კარგად :D თქვენ გაქვთ " + money + "ლარი" );
                System.out.println();
                break;
            }
            else{
                System.out.println("შეყვანეთ მხოლოდ Y ან N!");
            }
        }
    }
}