package com.pvt.thread;

public class ThreadExample {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					try {
						System.out.println("Thread: " + getName() + " running");
						Thread.sleep(2000);
						System.out.println("Thread: " + getName() + " completed");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
