package by.it.bobrovich.jd02_02;

import java.util.Random;

public class Helper {

    private static Random generator = new Random();

    private Helper(){
    }

    public static int getRandom(int start, int finish){
        return start + generator.nextInt(finish - start + 1);
    }
    public static void sleep(int timeout){
        try{
            Thread.sleep(timeout/ Manager.K_SPEED);
        } catch (InterruptedException e){
            throw new RuntimeException("Interrupted" + Thread.currentThread(), e);
        }
    }
}
