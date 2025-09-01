package com.tnsif.interthreaddemo;
//Demo for producer and consumer
public class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();  // wait until data is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify();  // notify consumer
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();  // wait until data is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();  // notify producer
        return data;

	
	
	
    }
	
}
