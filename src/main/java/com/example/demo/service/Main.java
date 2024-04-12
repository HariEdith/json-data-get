package com.example.demo.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Main {
	public static void main(String []args) throws FileNotFoundException, IOException, ParseException {
		String jsonPath="D:\\Hari\\docs\\SampleResponse.json";
		JsonReader.getAcctId(jsonPath);
		
	}
}
