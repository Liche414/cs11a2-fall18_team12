public class FinalProject {
  public static void main(String[] args){
    System.out.println("Team 12's Movie DataBase");
    String filename = "Movies.txt";
    if (args.length > 1){
      filename = args[0];
      //word = args[1]; we can perhaps use something in the command line to read a genre type if the user provides it
    } else {
      System.out.println("usage: java FinalProject FILENAME CATEGORY");
    }
    System.out.println("Do you want to add a Movie to the list?");
    //write code that adds the user's input to the textfile if it already isn't in the list
    //String word = TextIO.getlnString();
    System.out.println("Type 1 if you want to read the list of movies (currently a test method)");
    System.out.println("Type 2 if you want to do testlib()");
    int userChoice = 0;
    while ((userChoice < 1) && (userChoice > 2)){ //make this while loop repeat for every number outside our possible if/esle statements
      userChoice = TextIO.getInt();
      if (userChoice == 1){ //we will continue to make an else if list for every method we choose to do
        ReadAllTheMoviesInTheFile(filename);
      } else if (userChoice == 2){
        PrintMovieList();
      } else {
        System.out.println("That's not a valid input... Please choose one of the numbers choices given");
      }
    }
  }

  public static void ReadAllTheMoviesInTheFile(String filename){
    TextIO.readFile(filename); // start reading from the file!
    String line = " ";
    int lineNumber = 1;
    while (!TextIO.eof()){
      line = TextIO.getln();
      lineNumber++;
    }
    /* get certain words
    line = TextIO.getln();
    if (line.contains(word)){ //|| line.contains(word2) --> find out why you had this before!!!!!!!!!!!!!!!!!!!!!!!!!!
      System.out.printf("%4d %s%n", lineNumber, line);
    }
    lineNumber++;
    */

  }

  //from TextLib Program
  public static void PrintMovieList(){
    String contents = readFileAsString("Movies.txt");
    String[] lines = contents.split("\\n");
    String[] words = splitIntoWords(contents);
    System.out.printf("%n How many movies would you like to me to print?: %n%n");
    for(int i=0;i<200; i++) {
      System.out.printf(words[i]+" ");
    }
    System.out.printf("%n%nMovies.txt length is "+contents.length()+"%n");
    System.out.printf("Movies contains %d words%n",words.length);
    System.out.printf("Movies contains %d lines%n%n",lines.length);
  }
}
