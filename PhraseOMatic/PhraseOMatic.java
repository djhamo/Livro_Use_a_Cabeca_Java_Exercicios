public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham",
		"front-end", "Baseado na Web", "difundido", "inteligente", "seis sigmas", "caminho crítico",
		"dinâmico"} ;
		
		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", 
		"distribuído", "agrupado", "soldificado", "independente de Máquina", "posicionado", "em rede", 
		"dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
	
		String[] wordListThree = { "Processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo",
		"estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};
		
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