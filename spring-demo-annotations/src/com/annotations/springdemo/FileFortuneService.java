package com.annotations.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	protected ArrayList<String> data = new ArrayList<String>();
	private Random myRandom = new Random();
	
	public FileFortuneService () {
		File file = new File(".//src//fortunes.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file));) {
			String s = br.readLine();
			while (s != null) {
			    data.add(s);
			    s = br.readLine();
			  }
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IOexception");
		}
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.size());
		return data.get(index);
	}

}
