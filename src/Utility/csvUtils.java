package Utility;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import Utility.constant;
//import Utility.utils;
//import pageObjects.Post_page;

public class csvUtils {
	public static void main(String[] args) throws IOException {
		String Path = (constant.Path_TestData + constant.File_TestData);
		
		CSVReader csvSource;
		 List<String[]> allLines;  
	    FileReader fileReader = new FileReader(Path);
		
		 
	
	 CSVReader csvReader2 = csvSource = new CSVReader(fileReader);
		CSVReader csvReader = csvReader2;
	
		  allLines = csvSource.readAll();
	
		 
		
		  for (int lineNo = 0; lineNo < allLines.size(); lineNo++) {
		

			int lineNumber = 0;
			String[] currentLineArray = allLines.get(lineNumber);
		
		    String currentLine = currentLineArray[0];
		
		    String[] values = currentLine.split("-");
	
		 
		
		    for (int index = 0; index < values.length; index++)
		
		      System.out.println(values[index]);

		  }
		
		 

	}

	
}	
