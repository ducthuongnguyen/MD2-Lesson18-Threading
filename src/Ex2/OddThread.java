package Ex2;

public class OddThread extends Thread{


    public void run(){
    for (int i = 1; i <10 ; i++) {
        if (i%2!=0){
            System.out.println("Print the odd numbers: "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}
