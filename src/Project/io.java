package Project;
import java.util.FileOutStream;


import java.io.*;
public class io{
	public static void main(String[] args) throws IOException {
		FileOutputStream fi=new FileOutputStream("myfile.txt");
		String name="hi";
		byte b[]=name.getBytes();
		fi.write(b);
		
		
		
	}

}
