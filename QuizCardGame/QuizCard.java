public class QuizCard {
	private String _question;
	private String _answer;
	
	public QuizCard(String question, String answer) {
		_answer = answer;
		_question = question;
	}
	
	public String getQuestion() {
		return _question;
	}
	
	public String getAnswer() {
		return _answer;
	}

}