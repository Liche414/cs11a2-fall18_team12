// Java Program to illustrate reading from
// FileReader using FileReader
import java.io.*;
public class ReadingFromFile{
	public static void main(String[] args) throws Exception{
		FileInputStream fstream = new FileInputStream("Movies.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)  	 {
		  // Print the content on the console
		  System.out.println (strLine);
		}

		//Close the input stream
		br.close();
}
}
