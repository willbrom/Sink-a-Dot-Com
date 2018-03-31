import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> loc) {
		this.locationCells = loc;
	}

	public String checkYourself(String userInput) {
		String result = "Miss";

		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(userInput);

			if (locationCells.isEmpty()) {
				result = "Kill";
			} else {
				result = "Hit";
			}
		}
		
		return result;
	}
}
