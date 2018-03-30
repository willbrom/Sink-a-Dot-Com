import java.io.*;

public class GameHelper {
  public static String getUserInput() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String userInput = null;
    try {
      userInput = br.readLine();
    } catch(Exception e) {
      System.out.println("IOException " + e);
    }
    return userInput;
  }
}
