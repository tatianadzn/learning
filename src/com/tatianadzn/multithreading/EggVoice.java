package com.tatianadzn.multithreading;

public class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg!");
        }
    }
}
