public class SimpleDotComGame {
  public static void main(String[] args) {
    int numOfGuesses = 0;
    SimpleDotCom dot = new SimpleDotCom();

    // int array to hold dot com positions
    int[] locationsCells = new int[3];

    // compute random number between 0 and 4
    int rand = ((int) (Math.random() * 5)) + 1;

    locationsCells[0] = rand;
    locationsCells[1] = ++rand;
    locationsCells[2] = ++rand;

    // set dot com position
    dot.setLocationCells(locationsCells);

    boolean isAlive = true;
    while (isAlive) {
      String usersGuess = GameHelper.getUserInput();
      String result = "Miss";
      result = dot.checkYourself(usersGuess);
      numOfGuesses++;

      if (result.equals("Kill")) {
        isAlive = false;
        System.out.println("It took you " + numOfGuesses + " tries to sink the DotCom!");
      }
    }
  }
}
