package edu.unca.csci201;

public class FillInTheBlankQuestion implements Question {
	
	private String answer;
	private String question;


	public FillInTheBlankQuestion(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	

	@Override
	public String getTheQuestionText() {

		return question;
	}
	

	@Override
	public boolean isCorrectAnswer(String answer) {

		if(answer.equals(this.answer)) {				// If correct answer, return true
			return true;
		}
		
		else return false;								// Else return false
	}

	
	@Override
	public String getCorrectAnswer() {

		return answer;
	}

}
