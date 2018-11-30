package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

	private int totalCorrect;
	private double grade;
	private int number;
	private Question[] quizQuestions = new Question[25];		
	private int length = quizQuestions.length;
	private Question[] wrongAnswers = new Question[length];			
	Scanner scan = new Scanner(System.in);
	

	// Method for adding questions to question array
	
	public void addQuestion(Question q) {
		
		if(number <= length) {						// If still space for question, add to question array
			quizQuestions[number] = q;
			number++;								// Increment for next question
		}
		
		
	}


	// Method for printing out quiz questions and determining correctness
	
	public double giveQuiz() {	
		
		String userAnswer;
		int wrongCnt = 0;
		
		for(int i = 0; i < length; i++) {
			System.out.println(quizQuestions[i].getTheQuestionText());			// Print question
			userAnswer = scan.nextLine();										// Get answer
			System.out.println();												
			
			if(quizQuestions[i].isCorrectAnswer(userAnswer)) {					// If right answer count as correct
				totalCorrect++;
			}
			
			else {																// If wrong add to wrongly answered question array
				wrongAnswers[wrongCnt++] = quizQuestions[i];
			}
		}
		
		grade = (double) totalCorrect/length;									// Calculate grade
	
		return grade;
	}
	
	
	// Method for printing the questions answered incorrectly, with correct answers
	
	public void printWrong() {

		int wrongAns = wrongAnswers.length;
		
		for(int i = 0; i < wrongAns; i++) {
			if(wrongAnswers[i] == null) {						// Check to make sure we're not at the end of the wrong answers
				break;
			}
			System.out.println(wrongAnswers[i].getTheQuestionText() + "\n  Correct Answer: "	// Print out quesitons with correct answers 
					+ "" + wrongAnswers[i].getCorrectAnswer() + "\n");
			System.out.println();
		}
		
	}

}
