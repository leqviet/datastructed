package com.quiz;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

//https://kalliphant.com/jackson-convert-csv-json-example/
	
public class CsvToJson {
	 public static void main(String[] args) throws Exception {
	        File input = new File("D:/clients/homework/test.csv");
//	        File output = new File("output.json");
	 
	        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
	        CsvMapper csvMapper = new CsvMapper();
	 
	        // Read data from CSV file
	        List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
	 
	        ObjectMapper mapper = new ObjectMapper();
	 
	        // Write JSON formated data to output.json file
//	        mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);
	 
	        // Write JSON formated data to stdout
	        String output = mapper.writeValueAsString(readAll);
	        System.out.println(mapper.writeValueAsString(readAll));
	        List<DBObject> dbObject =(List<DBObject>) JSON.parse(output);
		    //DBObject dbObject = (DBObject)JSON.parse(output);
		    System.out.print("dbObject"+dbObject);
	    }
	 
	 //[{"rep_file_num":"814-00034","CIK":"0000731812","entity_name":"SIERRA RESOURCES CORP","street1":"629 J STREET","street2":"SUITE 202","city":"SACRAMENTO","state_code":"CA","zip":"95814","filing_date":"12/30/96","doc_type_code":"15 "},{"rep_file_num":"814-00053","CIK":"0000821472","entity_name":"WESTFORD TECHNOLOGY VENTURES LP","street1":"17 ACADEMY ST 5TH FLOOR","street2":"[NULL]","city":"NEWARK","state_code":"NJ","zip":"07102-2905","filing_date":"01/28/04","doc_type_code":"NO ACT ... "},{"rep_file_num":"814-00098","CIK":"0000878932","entity_name":"EQUUS TOTAL RETURN, INC.","street1":"EIGHT GREENWAY PLAZA","street2":"SUITE 930","city":"HOUSTON","state_code":"TX","zip":"77046","filing_date":"08/25/16","doc_type_code":"40-APP/A"}]


}
