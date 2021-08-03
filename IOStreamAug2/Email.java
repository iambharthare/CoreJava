package IOStreamAug2;

import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Email {

	public static void main(String[] args) throws Exception {
		FileReader fr= new FileReader("C:\\Email.txt");
		
		  BufferedReader br= new BufferedReader(fr); 
		  String line = br.readLine();
		  String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		  
		  
	       Pattern pattern = Pattern.compile(regex);
	        
		  while (line==null) {
			  if(line.contains("@gmail.com")){
				  
				  System.out.println(line);
					line=br.readLine();
				  }
			/*
			 * else if(line.contains("@yahoo.in")) { System.out.println(line);
			 * line=br.readLine(); } else if(line.contains("@bing.com")) {
			 * System.out.println(line); line=br.readLine(); }
			 */
		  
		  else{
			 System.err.println(line);
			 line=br.readLine();
			
			  
		  }}
	      fr.close();

	}}

	
