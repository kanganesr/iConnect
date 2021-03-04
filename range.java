import java.io.*;
import java.util.*;
import java.util.regex.*;
//import com.opencsv.CSVReader; 
//import com.opencsv.CSVWriter; 

class range{
	public static void main(String args[])throws Exception
	{
			File file=new File(args[0]);
			
				FileWriter fw=new FileWriter(file,true);
				BufferedReader br=new BufferedReader(new FileReader(file));
				

				String line =br.readLine();
				String text;
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
					//System.out.println(temp);
					if(temp != null && temp.length()>0)
							{
								String demo="\""+temp+"\"";
								//System.out.println(demo);								
								//fw.write(demo);
								//fw.append(",");
								//fw.flush();
							}
				}
			}
			
			while(( text=br.readLine())!=null)
			{
			
				if(text!=line)
				{
						String all[]=text.split(",");
						float num1=Float.parseFloat(all[3].toString());
						float num2=Float.parseFloat(all[4].toString());
						String st3=Float.toString(num1-num2);
						
						for(int i=0;i<all.length;i++)
						{
							String row=all.toString();
						
							System.out.println(row);
						}
						
					
				}
			
			
			
			}
			
		
	}
}