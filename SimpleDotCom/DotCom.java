import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	
	public void setLocationsCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setLocationsCells(int[] loc) {
		locationCells = new ArrayList<String>();
		for (int cell : loc) {
			 locationCells.add(Integer.toString(cell));
		 }
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}