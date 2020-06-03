package com.huajie.chapter05;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingDemo {

    ArrayBlockingQueue<String> ab = new ArrayBlockingQueue(10);

    {
        init();
    }

    public void init() {
        new Thread(() -> {
            while (true) {
                try {
                    String data = ab.take();
                    System.out.println("receive:" + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void addData(String data) throws InterruptedException {
        ab.add(data);
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {

        BlockingDemo demo = new BlockingDemo();
        for (int i = 0; i < 100; i++) {
            demo.addData("haha" + i);
        }
    }

}
