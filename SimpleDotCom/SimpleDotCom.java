public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);// convert string to int
		String result = "miss";

		//this is enhanced for loop; each time through the loop, the variable 'cell' will hold a different element from the array, until until there are no more elements

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break; // breaks from loop unconditionally
			}
		} // out of the loop

		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		System.out.println(result);
			return result;
	}
}
