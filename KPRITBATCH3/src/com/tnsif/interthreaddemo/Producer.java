package com.tnsif.interthreaddemo;

public class Producer extends Thread {

	private SharedResource resource;

	public Producer(SharedResource resource) {
		super();
		this.resource = resource;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			resource.produce(i);
		}
	}
	
	
	
	
}
