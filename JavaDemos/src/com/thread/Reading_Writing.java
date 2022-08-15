package com.thread;

import java.io.File;

public class Reading_Writing {

	public static void main(String[] args) {

		File f = new File("f:\\userinfo.txt");
		FileOperations file_task = new FileOperations();
		WriterThread wt = new WriterThread(f, file_task, "writer");
		ReaderThread rt = new ReaderThread(f, file_task, "reader");
	}
}
