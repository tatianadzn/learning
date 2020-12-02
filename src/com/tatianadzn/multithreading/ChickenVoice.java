package com.tatianadzn.multithreading;

public class ChickenVoice {
    public static void main(String[] args) throws InterruptedException {
        EggVoice eggVoice = new EggVoice();

        System.out.println("Let the battle begin");
        eggVoice.start();
        
        for (int i = 0; i < 5; i++){
            Thread.sleep(1000);

            System.out.println("Chicken!");
        }

        if (eggVoice.isAlive()){
            eggVoice.join();
            System.out.println("Egg has won");
        } else{
            System.out.println("Chicken has won");
        }
        System.out.println("Battle is over");
    }
}
