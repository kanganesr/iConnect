import java.io.*;
import java.util.*;
import java.util.regex.*;
//import com.opencsv.CSVReader; 
//import com.opencsv.CSVWriter; 

class demo{
	public static void main(String args[])throws Exception
	{
			File file=new File(args[0]);
			
				FileWriter fw=new FileWriter("out.csv");
				BufferedReader br=new BufferedReader(new FileReader(file));
				

				String line =br.readLine();
			do
			{
				String [] strArray=line.split(",");
				//System.out.println(Arrays.toString(strArray));
				ArrayList<String> myList = new ArrayList<String>(Arrays.asList(strArray));
				String column="Range";
				myList.add(column);
				//System.out.println(myList);
				
				String s=myList.toString();
				String regex="\\W";
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(s);
				
				if(m.find())
				{
				String[] arr=p.split(s);
				for(String temp:arr)
				{	
					System.out.println(temp);
					if(temp != null && temp.length()>0)
							{
								String demo="\""+temp+"\"";
								System.out.println(demo);								
								fw.write(demo);
								fw.append(",");
								fw.flush();
							}
				}
				}
			}while(line!=null);

			
			
		
	}
}