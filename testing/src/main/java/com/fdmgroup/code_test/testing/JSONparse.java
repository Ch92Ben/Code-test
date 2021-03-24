package com.fdmgroup.code_test.testing;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 
  
public class JSONparse 
{ 
    
	
	public static void main(String[] args) throws Exception  
    { 
		
		
        // parsing file "user.json" 
        Object object = new JSONParser().parse(new FileReader("JSONExample.json")); 
        JSONObject dataObject = (JSONObject) object;  
       
        JSONArray dataArray = (JSONArray) dataObject.get("list");
        
        
        List<String> countryNames = new ArrayList<>();
        int selectedCountriesCounter = 0;
        for(int i = 0; i < dataArray.size(); i++) {
        	
        	JSONObject inner =  (JSONObject) dataArray.get(i);
        	if(inner.get("name").toString().toLowerCase().startsWith("t")) {
        		countryNames.add((String) inner.get("name"));
        		selectedCountriesCounter++;
        }
        
        	

    }
        
        System.out.println(selectedCountriesCounter);
}}