public class FinalProject {
  public static void main(String[] args){
    System.out.println("Concordance generator");
    String filename = "Movies.txt";
    if (args.length > 1){
      filename = args[0];
      word = args[1];
    } else {
      System.out.println("usage: java FinalProject FILENAME CATEGORY");
    }
    String word = TextIO.getlnString();
    TextIO.readFile(filename); // start reading from the file!

    String line = " ";
    int lineNumber = 1;
    while (!TextIO.eof()){
      line = TextIO.getln();
      if (line.contains(word)){ //|| line.contains(word2) --> find out why you had this before!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.printf("%4d %s%n", lineNumber, line);
      }
      lineNumber++;
    }
}
