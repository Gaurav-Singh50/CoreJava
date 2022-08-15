package com.thread;

import java.io.*;

public class ReaderThread implements Runnable {
	File f;
	FileOperations opertaions;
	Thread t;

	public ReaderThread(File f, FileOperations opertaions, String name) {

		this.f = f;
		this.opertaions = opertaions;
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("In Reader");
		opertaions.fileRead(f);

	}

}
