package Task4;


public class Main {

    public static void main(String[] args) {
        int n = (int) ((Math.random() * (20000 - 10000)) + 10000);
        int m = (int) ((Math.random() * (20000 - 10000)) + 10000);

        ThreadForN threadForN = new ThreadForN(n);
        ThreadForM threadForM = new ThreadForM(m);

        threadForN.start();
        threadForM.start();
    }

    public static class ThreadForN extends Thread{
        private final int n;

        public ThreadForN(int n){
            this.n = n;
        }

        public void run(){
            for(int i=1; i<=n; i++){
                if(n % i == 0 && i<100){
                        System.out.println(i);
                }
            }
        }
    }


    public static class ThreadForM extends Thread{
        private final int m;

        public ThreadForM(int m){
            this.m = m;
        }

        public void run(){
            for(int i=1; i<=m; i++){
                if(m % i != 0 && i<100){
                    System.out.println(i);
                }
            }

        }
    }

}