package basicPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Filehandling 
{
	public static void readprop() throws Exception
	{
		
		//File f = new File("./TestData/abc.properties");
		
		FileReader fr = new FileReader("./TestData/abc.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("lang"));
		
		
		System.out.println(prop.get("automation"));
		System.out.println(prop.get("testing"));
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
	
	}
	
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\data.txt");  //file connection
		
		File f = new File("./TestData/data1.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		while(r!=-1)
		{
			
			System.out.print((char)r);
			r = fr.read();
		}
	}

	public static void main(String[] args) throws Exception
	{
		readprop();

	}

}
