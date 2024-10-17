package es.davidEguaras._22_Threads;


import java.sql.SQLOutput;

public class ThreadsTest {
    //throws is because of join
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Thread 1: " + i);
            }
            System.out.println("Thread one is done executing");
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        one.start();
        // --- JOIN METHOD ---
        // this method "blocks" the current thread,
        // making the system finish the execution of the thread that called the method before advancing further in the program execution
        one.join();
        System.out.println("Now the program enters this instruction, which means that the Thread one has finished it execution");
        two.start();



    }
}
