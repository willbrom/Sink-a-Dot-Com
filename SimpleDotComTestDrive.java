public class SimpleDotComTestDrive {
  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();

    int[] locations = {2, 3, 4};
    dot.setLocationCells(locations);

    // Testing Hit
    String usersGuess = "2";
    String result = dot.checkYourself(usersGuess);

    String testResult = "failed";

    if (result.equals("Hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);

    // Testing Miss
    usersGuess = "5";
    result = dot.checkYourself(usersGuess);

    testResult = "failed";
    if (result.equals("Miss")) {
      testResult = "passed";
    }

    System.out.println(testResult);

    // Testing Kill
    dot = new SimpleDotCom();

    dot.setLocationCells(locations);

    String usersFirstGuess = "2";
    String usersSecondGuess = "3";
    String usersThirdGuess = "4";

    String firstResult = dot.checkYourself(usersFirstGuess);
    String secondResult = dot.checkYourself(usersSecondGuess);
    String thirdResult = dot.checkYourself(usersThirdGuess);

    testResult = "failed";
    if (firstResult.equals("Hit") && secondResult.equals("Hit") && thirdResult.equals("Kill")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}
