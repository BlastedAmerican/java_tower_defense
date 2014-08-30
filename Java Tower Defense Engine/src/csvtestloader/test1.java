package csvtestloader;
//Bases off tutorial code by mkyong at http://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class test1 {
	protected static ArrayList<String> fileThatIsRead;
	protected static ArrayList<String> data;

 public static void main(String[] args) {
	 String fileName ="Test.csv";
	String csvFile = "/Users/Will/Downloads/"+fileName;
	test1 obj = new test1();
	fileThatIsRead= new ArrayList<String>();
	fileThatIsRead=obj.load(csvFile);
	obj.printRead(fileThatIsRead);
	System.out.println(" Done");
 }

 public ArrayList<String> load(String csvFile) {
	
	
	BufferedReader br = null;
	String line = "";
	String csvSplitBy = ",";
	data = new ArrayList<String>();
	String[] tempArray=null;
	try 
	{
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) 
		{    
			tempArray=line.split(csvSplitBy);
		}
		for (int i=0; i<tempArray.length;++i){
		data.add(tempArray[i]);
		}

	} 
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	} 
	finally 
	{
		if (br != null) 
		{
			try 
			{
				br.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return data;
}
 public void printRead(ArrayList<String> csvFile)
 {

	for (int i=0;i<csvFile.size();++i)
		{
		System.out.print(csvFile.get(i)+",");
		}
		
 	
 }
}


