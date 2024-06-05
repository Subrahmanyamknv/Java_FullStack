package File_handling_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
public static void main(String []args) throws IOException{
	String path1="C:\\Users\\renud\\Desktop\\java programs\\wcp\\Input.txt";
	String path2="C:\\Users\\renud\\Desktop\\java programs\\wcp\\Output.txt";
	FileReader fr=new FileReader(path1);
	BufferedReader br=new BufferedReader(fr);
	int temp;
	FileWriter fw=new FileWriter(path2);
	BufferedWriter bw=new BufferedWriter(fw);
	while((temp=br.read())!=-1)
	{
		bw.write(temp);
	}
	bw.flush();
	bw.close();
	br.close();
}
}
