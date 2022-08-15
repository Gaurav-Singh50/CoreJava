package com.thread;

import java.io.*;

public class WriterThread implements Runnable {
	File f;
	FileOperations opertaions;
	Thread t;

	public WriterThread(File f, FileOperations opertaions, String name) {

		this.f = f;
		this.opertaions = opertaions;
		t = new Thread(this, name);
		t.start();

	}

	@Override
	public void run() {
		System.out.println("In writer");
		opertaions.fileWrite(f);

	}

}
