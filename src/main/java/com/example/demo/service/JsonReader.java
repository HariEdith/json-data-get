package com.example.demo.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	public static void getAcctId(String jsonPath) throws FileNotFoundException, IOException, ParseException {
		JSONParser passer = new JSONParser();
		List<Map<String, Object>> jsonData = new ArrayList<>();
		List<Object> acctIDList=new ArrayList<>();
		JSONObject jData = (JSONObject) passer.parse(new FileReader(jsonPath));
		Map<String, Object> response = new ObjectMa

		JSONObject body = (JSONObject) jData.get("Body");
		JSONObject custAcctInqResponse = (JSONObject) body.get("CustAcctInqResponse");
		JSONObject custAcctInqRs = (JSONObject) custAcctInqResponse.get("CustAcctInqRs");
		JSONArray genUnifiedAcctsDtls = (JSONArray) custAcctInqRs.get("GenUnifiedAcctsDtls");
		for (Object object : genUnifiedAcctsDtls) {
			if (object instanceof JSONObject) {
				JSONObject object1 = (JSONObject) object;
				Object i=object1.get("SaleDtls");
			
				if (i instanceof JSONObject) {
				JSONObject object2=(JSONObject) i;
				Object acctId=object2.get("AcctId");

				acctIDList.add(acctId);
				}}
			}
		
		System.out.println(acctIDList);
		}

//			
//			JSONObject acctId=(JSONObject)saleDtls.get("AcctId");

	}


