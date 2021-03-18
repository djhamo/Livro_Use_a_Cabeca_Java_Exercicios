import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		dotComsList.add(one);
		
		DotCom two = new DotCom();
		two.setName("eToys.com");
		dotComsList.add(two);
		
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(three);

		System.out.println("Seu objetico � eliminar tr�s dot com.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Tente eliminar todas no menor n�mero de palpites");
		for (DotCom dotComToSet: dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationsCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Insira um palpite");
			if (userGuess.equals("qq")) {
				break;
			}
			if (userGuess.equals("99")) {
				helper.desenhaResposta(dotComsList);
			}
			
			checkUserGuess(userGuess);			
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "errado";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("correto")) {
				break;
			}
			if (result.equals("eliminar")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() {
		System.out.println("Todas as Dot Coms foram eliminadas! Nossa que m�ximo...");
		if (numOfGuesses <= 18) {
			System.out.println("Voc� s� usou " + numOfGuesses + " palpites.");
			System.out.println("Voc� terminou antes de eliminar suas op��es... que orgulho pra ra�a humana");
		} else {
			System.out.println("Demorou demais... " + numOfGuesses + " palpites");
			System.out.println("Sooo Lame");
		}
	}
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
	
}