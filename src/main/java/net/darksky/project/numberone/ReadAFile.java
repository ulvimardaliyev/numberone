package net.darksky.project.numberone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadAFile {
	private BufferedReader bufferedReader;
	private FileReader fileReader;
	private String fileName;
	private String line;
	
	
	public ReadAFile(String file) {
		this.fileName = file;
	}

	public void readWords() throws IOException {
		this.fileReader = new FileReader(fileName);
		this.bufferedReader = new BufferedReader(fileReader);
		
		int lineLetterCount=0;
		while (!((line = bufferedReader.readLine()).equals("*"))) {
			System.out.println(line);
			lineLetterCount++;
		}
		bufferedReader.mark(lineLetterCount+2);
		bufferedReader.reset();
		line = "";
	}

	public void readRemainingWords() throws IOException {
		while((line = this.bufferedReader.readLine()) !=null) {
			System.out.println(line);
		}
	}
}
