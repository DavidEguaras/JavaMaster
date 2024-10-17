package es.davidEguaras._22_Threads;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " says Hi!");

        Thread one = new Thread(() -> {
            System.out.println("Thread one says Hi as well!");
        });

        one.setPriority(Thread.MAX_PRIORITY); // Establece la máxima prioridad
        one.start(); // Inicia el hilo

        try {
            one.join(); // Espera a que el hilo 'one' termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
