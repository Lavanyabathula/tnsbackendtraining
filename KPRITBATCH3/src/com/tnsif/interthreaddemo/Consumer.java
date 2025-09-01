package com.tnsif.interthreaddemo;

public class Consumer extends Thread{
  
	private SharedResource resource;

	public Consumer(SharedResource resource) {
		super();
		this.resource = resource;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			resource.consume();
		}
	}
	
	
	
	
}
