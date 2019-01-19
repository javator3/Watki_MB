package pl.sda.watki;

import java.util.Random;

public class RunnerDouble extends Thread {

public void run(){
    for (int i=0; i<5;i++) {
        int wynik;
        Random rand = new Random();
        int n = rand.nextInt(9);
        System.out.println(n + " " + Thread.currentThread().getName());
        wynik = n * 2;

        System.out.println(wynik + " " + Thread.currentThread().getName());
    }

}



}
