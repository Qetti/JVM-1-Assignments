package Task1;


public class Function1 extends Thread {

    public void run(){
        generateDoubles();
    }


    //    მეთოდი აგენერირებს [-5; 1] შუალედიდან double მონაცემებს, იძახებს ფუნქციას, რომელსაც გადასცემს ამ მონაცემებს და შემდეგ წერს ფაილში.
    public void generateDoubles(){
        for(int i=-500; i<101; i ++){
            double y = function(i/100.0);
            String result = String.format(" %.2f", y);
            saveResults(result);
        }
    }


    //    მეთოდი, რომელიც ითვლის მნიშვნელობებს
    //    y = 3x^3 − 5
    public static double function(double x){
        return -Math.pow(x,2) + 3*x;
    }


//    მეთოდი, რომელიც ინახავს დათვლილ მონაცემებს ტექსტურ ფაილში
    private void saveResults(String num){
        Function2.saveState(num);
    }
}



