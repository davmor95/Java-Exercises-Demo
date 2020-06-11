package com.cognixia.jump.Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) throws IOException {
		CreateAndWriteFile();

	}
	
	public static void CreateAndWriteFile() throws IOException {
		File file = new File("file1.txt");
		
		//create the file
		if(file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}
		
		//write content
		FileWriter writer = new FileWriter(file);
		for(int i = 1; i <= 5000; i++) {
			writer.write(i);
		}
	}

}
