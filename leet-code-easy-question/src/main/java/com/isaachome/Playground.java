package com.isaachome;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Playground {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
         Runnable task = ()->{
             try {
                 // Simulate task processing with sleep
                 System.out.println("Task started by " + Thread.currentThread().getName());
                 Thread.sleep(2000); // Sleep for 2 seconds
                 System.out.println("Task completed by " + Thread.currentThread().getName());
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         };
        executor.execute(task);
        executor.shutdown();
        MyThread thread = new MyThread();
        thread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> {
            // Task implementation
            System.out.println("Hello From Future");
        });
    }

}

class MyExecutor implements Executor{
    @Override
    public void execute(Runnable command) {
         new Thread(command);
    }
}

class MyThread extends Thread {
    public void run() {
        // Task implementation
        System.out.println("Starting MyThread...");
    }
}