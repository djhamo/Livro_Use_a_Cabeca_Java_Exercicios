public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();		
		//SimpleDotCom theDotCom = new SimpleDotCom();		
		DotCom theDotCom = new DotCom();
		
		int randomNum = (int) (Math.random() * 5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		
		theDotCom.setLocationsCells(locations);
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("Insira um Número");
			String result = theDotCom.checkYourself(guess);
			System.out.println(result);
			numOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("Você usou " + numOfGuesses + " palpites");
				
			}
		}
	}
}