import java.io.*;
import java.util.*;

public class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphacoords = new String[comSize];
		String temp = null;
		int[] coords = new int[comSize];
		int attempts = 0;
		boolean sucess = false;
		int location = 0;
		
		comCount++;
		int incr = 1;
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}
		while ( !sucess & attempts++ < 200) {
			location = (int) (Math.random() * gridSize);
			//System.out.print(" try " + location);
			int x = 0;
			sucess = true;
			while (sucess && x < comSize) {
				if (grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					if (location >= gridSize) {
						sucess = false;
					}
					if (x > 0 && (location % gridLength == 0)) {
						sucess = false;
					}
				} else {
					//System.out.print(" used " + location);
					sucess = false;
				}
			}

		}
		int x = 0;
		int row = 0;
		int column = 0;
		//System.out.println("\n");
		while ( x < comSize) {
			grid[coords[x]] = 1;
			row = (int) (coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
				
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			//System.out.print(" coord " + x + " = " + alphaCells.get(x - 1));
		}
		//System.out.println("\n");
		return alphaCells;
		
	}
	
	public void desenhaResposta(ArrayList<DotCom> dotComsList) {
		System.out.println(" " + alphabet);
		boolean primeira_linha = true;
		for (int row = 0; row < gridLength; row++) {
			for (int column = 0; column < gridLength; column++) {
				if (primeira_linha) {
					System.out.print(row );
					primeira_linha = false;
				}
				
				boolean achou = false;
				for(DotCom tempCom : dotComsList) {
					String temp = String.valueOf(alphabet.charAt(column));
					String userGuess = temp.concat(Integer.toString(row));
					String result = tempCom.justCheckYourself(userGuess);
					if (result.equals("correto")) {
						achou = true;
					}
				}
				if (achou) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
					
			}
			primeira_linha = true;
			System.out.print("\n");
		}
	}
}