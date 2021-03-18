public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuest) {
		 int guess = Integer.parseInt(stringGuest);
		 String result = "miss";
		 for (int cell : locationCells) {
			 if (guess == cell) {
				 result = "hit";
				 numOfHits++;
				 break;
			 }
		 }
		 
		 if (numOfHits == locationCells.length) {
			 result = "kill";
		 }
		 
		 System.out.println(result);
		 return result;
	}
		
}