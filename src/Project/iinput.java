package Project;
import java.io.*;

public class iinput {
	public static void main(String args[]) throws IOException{
		
	
	FileInputStream fo=new FileInputStream("myfile.txt");
	int ch;
	while(fo.read()!=-1) {
		ch=fo.read();
		System.out.println((char)ch);
	}
	
	}

}
