public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "v�rias camadas", "30.000 p�s", "B-to-B", "todos ganham",
		"front-end", "Baseado na Web", "difundido", "inteligente", "seis sigmas", "caminho cr�tico",
		"din�mico"} ;
		
		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", 
		"distribu�do", "agrupado", "soldificado", "independente de M�quina", "posicionado", "em rede", 
		"dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
	
		String[] wordListThree = { "Processo", "ponto m�ximo", "solu��o", "arquitetura", "habilita��o no n�cleo",
		"estrat�gia", "mindshare", "portal", "espa�o", "vis�o", "paradigma", "miss�o"};
		
		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		for (int c = 0; c <= 100; c++) {
			int rand1 = (int) (Math.random() * oneLenght);
			int rand2 = (int) (Math.random() * twoLenght);
			int rand3 = (int) (Math.random() * threeLenght);
		
			String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] +
			" " + wordListThree[rand3];
		
			System.out.println("Precisamos de " + phrase);
		}
	}

}