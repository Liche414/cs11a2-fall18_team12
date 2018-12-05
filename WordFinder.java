import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;

public class WordFinder
{
  public static void main ( String[] args)
  {
    String fileName = "Movies.txt"; //string variable to hold the name of a text file.
	String line;
	String stringToSearch = "Star Wars";  // String to search for.
	int numberOfStrings = 0; // number of found strings in the text file.

	try
 	{
	  BufferedReader in = new BufferedReader( new FileReader( fileName  ) );
	  line = in.readLine();

		while (line !=  null)
    	{
	   	  if (line.startsWith(stringToSearch))
	      {
	   		System.out.println (line);
	   		numberOfStrings++;
   		  }
          line = in.readLine();
        }
       System.out.println ("The total number of lines containing the string is: " + numberOfStrings);
       in.close();
    }

 	 catch ( IOException e )
     {
	   System.out.println(e.getMessage() );
	 }
  }

}
