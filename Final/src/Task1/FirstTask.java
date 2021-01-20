package Task1;

import java.util.LinkedList;
import java.util.Random;

public class FirstTask implements FirsTask {
    LinkedList<String> list = new LinkedList<>();
    Random random = new Random();

    public void Method1() {
        String language = "abcdefghijklmnopqrstuvwxyz";
        int wordQuantity = 20;
        int wordLength = 7;

        for (int i = 0; i < wordQuantity; i++) {
            list.add(getRandomString(language, wordLength));
        }
    }

    public String getRandomString(String language, int length) {
        StringBuilder result = new StringBuilder();

        while (length > 0) {
            result.append(language.charAt(random.nextInt(language.length())));
            length--;
        }
        return result.toString();
    }

    public void Method2() {
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).contains("a")) {
                list.remove(k);
            }
        }
    }

    public void Method3() {
        for (int n = 0; n < 5; n++) {
            String str;
            String result = "";
            for (int m = 0; m < 4; m++) {
                str = Integer.toString((random.nextInt(10)));
                result = str + result;
            }
            int randIndex = (int) ((Math.random()) * (list.size()-1) + 1 );
            list.add(randIndex, result);
        }
    }

    public void Method4(){
        for(String j : list){
            System.out.println(j);
        }
    }

}
