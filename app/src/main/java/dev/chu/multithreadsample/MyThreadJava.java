package dev.chu.multithreadsample;

public class MyThreadJava extends Thread{
//    public void run() {
//        try {
//            System.out.println("Thread "+Thread.currentThread().getId()+" is running...");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    // Creating an object of class Sync for accessing resource
    Sync sync = new Sync();
    public void run() {
        sync.sum(10);
    }
}
