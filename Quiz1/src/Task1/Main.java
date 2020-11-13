package Task1;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        deleteFiles();
        Function1 function1 = new Function1();
        Function2 function2 = new Function2();
        function1.start();
        function2.start();
    }


    private static void deleteFiles(){
        File file = new File("results.txt");
        if(file.isFile()){
            file.delete();
        }
    }
}
