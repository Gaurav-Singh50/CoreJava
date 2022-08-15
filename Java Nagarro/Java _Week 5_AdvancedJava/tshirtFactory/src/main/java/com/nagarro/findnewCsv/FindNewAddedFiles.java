package com.nagarro.findnewCsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNewAddedFiles {
	public static ArrayList<String> find() throws IOException {
		Path path = Paths.get("CSV");
		Stream<Path> files = Files.walk(path);

		List<String> list = files.filter(Files::isRegularFile).map(Objects::toString).collect(Collectors.toList());

		ArrayList<String> allFiles = new ArrayList<String>(list);

		return allFiles;
	}

}