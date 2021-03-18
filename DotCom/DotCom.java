import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationsCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setLocationsCells(int[] loc) {
		locationCells = new ArrayList<String>();
		for (int cell : loc) {
			 locationCells.add(Integer.toString(cell));
		 }
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "errado";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "eliminar";
				System.out.println("Ora! Você afundou " + name + "  :(");
			} else {
				result = "correto";
			}
		}
		return result;
	}
	
	public String justCheckYourself(String userInput) {
		String result = "errado";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			result = "correto";			
		}
		return result;
	}
}