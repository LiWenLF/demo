package com.faisco.demo.day01;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("interrupted!");
                        break;
                    }
                }
                Thread.yield();
            }
        };
        t1.start();
        Thread.sleep(3000);
        t1.interrupt();
    }
}
