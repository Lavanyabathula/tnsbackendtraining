package com.tnsif.interthreaddemo;

public class InterThreadCommMain {

	public static void main(String[] args) {

     SharedResource resource=new SharedResource();
     
     Producer p=new Producer(resource);
		
     Consumer c=new Consumer(resource);
     
     p.start();
     c.start();
		
	}

}
