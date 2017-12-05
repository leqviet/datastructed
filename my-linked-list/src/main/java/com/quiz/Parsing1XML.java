package com.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class Parsing1XML {
	
	//https://stackoverflow.com/questions/36410922/jackson-xml-to-json-converter-removes-multiple-child-records

	public static void main(String[] args) {
			try (InputStream inputStream = new FileInputStream(new File(
	                "D:/clients/homework/staff.xml"))) {
			    String xml = IOUtils.toString(inputStream);
			    JSONObject jObject = XML.toJSONObject(xml);
			    ObjectMapper mapper = new ObjectMapper();
			    mapper.enable(SerializationFeature.INDENT_OUTPUT);
			    Object json = mapper.readValue(jObject.toString(), Object.class);
			    String output = mapper.writeValueAsString(json);
			    System.out.println(output);
			    
			    //DBObject dbObject = (DBObject)JSON.parse(output);
			    List<DBObject> dbObject =(List<DBObject>) JSON.parse(output);
			    System.out.print("dbObject"+dbObject);
	
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
	}
}
