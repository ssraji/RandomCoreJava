package com.raji.ems.employee;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.io.FileReader;  
  
public class FileReading
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int countline = 0;  
        int countwords =0;
  
        //Opens a file in read mode  
        FileReader file = new FileReader("/Users/raji/eclipse-workspace/EMS/src/com/raji/ems/employee/example.txt");  
        BufferedReader br = new BufferedReader(file);  
        
        HashMap<String,Integer> wordcountmap = new HashMap<String,Integer>();
      
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) { 
        	
            String words[] = line.split(" ");  
            countline = countline + words.length; 
            
            for(String word : words)
            {
            	if(wordcountmap.containsKey(word))
            	{
            		wordcountmap.put(word,wordcountmap.get(word)+1);
            		//System.out.println("the count is "+wordcountmap.get(word));
            	}
            	else
            	{
            		wordcountmap.put(word, 1);
            	}
            }
            
           }
        //System.out.println(wordcountmap.entrySet());
        br.close(); 
        
        String mostRepeatedWord = null;
        int count =0;
        Set <Entry<String,Integer>> entryset = wordcountmap.entrySet();
        for(Entry<String,Integer> entry : entryset)
        {
        	if(entry.getValue() > count)
        	{
        		mostRepeatedWord = entry.getKey();
        		count = entry.getValue();
        	}
        	//System.out.println(entry.getValue());
        }
        
        System.out.println("The most repeated word is "+mostRepeatedWord);
        
        
    }  
}  
