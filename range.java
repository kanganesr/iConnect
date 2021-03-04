import java.io.*;
import java.util.*;
import java.util.regex.*;
//import com.opencsv.CSVReader; 
//import com.opencsv.CSVWriter; 

class range{
	public static void main(String args[])throws Exception
	{
			File file=new File(args[0]);
			
				FileWriter fw=new FileWriter("new.csv");
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
								
								fw.write(demo);
								fw.append(",");;
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
						
						ArrayList<String> myCol = new ArrayList<String>(Arrays.asList(all));
						myCol.add(st3);
						//System.out.println(myCol);
						String newcol=myCol.toString();
						String regex1=",";
						Pattern p1=Pattern.compile(regex);
						Matcher m1=p1.matcher(newcol);
				
						if(m1.find())
						{
							String[] newarr=p1.split(newcol);
							for(String temp1:newarr)
							{	
								//System.out.println(temp);
								if(temp1 != null && temp1.length()>0)
								{
								String demo1="\""+temp1+"\"";
								//System.out.println(demo);
								fw.write(demo1);
								fw.append(",");
								fw.flush();
								
								}
							}
						}
								
				}
			}
								
	}
}