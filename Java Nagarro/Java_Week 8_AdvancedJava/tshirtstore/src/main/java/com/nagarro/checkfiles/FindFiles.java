package com.nagarro.checkfiles;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nagarro.dao.CsvReader;

public class FindFiles {
	public ArrayList<String> find() throws IOException {
		Path path = Paths.get("C:\\Users\\simranramswaroop\\eclipse-workspace\\tshirtstore\\CSV");
		Stream<Path> files = Files.walk(path);
		
		List<String> list = files.filter(Files::isRegularFile).map(Objects::toString).collect(Collectors.toList());
		ArrayList<String> allFiles = new ArrayList<String>(list);

		return allFiles;
	}
	
	public void checkForUpdate(long startTime) throws IOException {
		
		
		ArrayList <String> files = find();
		
		for(String path: files) {
			File file = new File(path);
			long modifiedTime = file.lastModified();
			
			if(modifiedTime > startTime) {
				CsvReader csv = new CsvReader();
				csv.addToDatabase();
			}
		}
	}

}