public class SimpleDotCom {
    private int[] locationsCells;
    private int numOfHits;

    public String checkYourself(String usersGuess) {
      //Convert user guess to int
      int guess = Integer.parseInt(usersGuess);

      //Create a result var to return and asign a default value('Miss')
      String result = "Miss";

      //Increment through each cell
      for (int cell : locationsCells) {

        //If cell matches users guess; Change result ot 'Hit', increase num of hits by 1 and break out of loop
        if (cell == guess) {
          result = "Hit";
          numOfHits++;
          break;
        }
      }

      //If number of hits is equal to the number of cells(ie: all cells have been hit). Change result to 'Kill'
      if (numOfHits == locationsCells.length) {
        result = "Kill";
      }

      return result;
    }

    public void setLocationCells(int[] locationsCells) {
      this.locationsCells = locationsCells;
    }
}
