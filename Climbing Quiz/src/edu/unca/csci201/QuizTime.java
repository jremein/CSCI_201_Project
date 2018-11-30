package edu.unca.csci201;

import java.text.NumberFormat;
import java.util.Scanner;

public class QuizTime {

	public static void main(String[] args) {


		Question[] quizQuestions = new Question[25];
		Quiz quiz = new Quiz();
		double grade;
		
		
		// True False Questions
		
		quizQuestions[0] = new TrueFalseQuestion("Climbers are adrenaline junkies. (T/F)\n", "F");			
		quizQuestions[1] = new TrueFalseQuestion("When considering volume, quality and diversity of "
				+ "climbing areas, North Carolina may be the best place to climb in the Southeast. (T/F)\n", "T");
		quizQuestions[2] = new TrueFalseQuestion("Western North Carolina is home to the East Coast's"
				+ " largest cliffside. (T/F)\n", "T");
		quizQuestions[3] = new TrueFalseQuestion("Free climbing is the same as free soloing (T/F)\n", "F");
		quizQuestions[4] = new TrueFalseQuestion("It's totally ok to tie in with a square knot (T/F)\n", "F");
		quizQuestions[5] = new TrueFalseQuestion("Some say you always have to keep a hand on the brake end"
				+ " while belaying, but it's not that big of a deal. (T/F)\n", "F");
		quizQuestions[6] = new TrueFalseQuestion("Alex Honnold is the stronget and best climber there is! "
				+ "(T/F)\n", "F");
		quizQuestions[7] = new TrueFalseQuestion("Alex Honnold is the most famous climber in the world "
				+ "right now (T/F)\n", "T");
		quizQuestions[8] = new TrueFalseQuestion("When you see clumps of moss and vegetation while climbing "
				+ "it's ok to pull it off the cliff and watch it smash on the ground below you, it's so entertaining! "
				+ "(T/F)\n", "F");
		quizQuestions[9] = new TrueFalseQuestion("Climbing is a great way to get rid of a fear or heights. (T/F)\n", "T");
		quizQuestions[10] = new TrueFalseQuestion("While inherently dangerous, a competent climber can mitigate most, but not all, "
				+ "of the risks associated with spending time in the mountains. (T/F)\n", "T");
		quizQuestions[11] = new TrueFalseQuestion("If you come across a peregrin falcon nest while climbing, it's best"
				+ " to knock the nest off the wall so they don't jeopardize climbing access. (T/F)\n ", "F");
		quizQuestions[12] = new TrueFalseQuestion("There's really only a couple different types of rock to climb"
				+ " in the southeast. (T/F)\n", "F");
		
		
		// Multiple Choice Questions
		
		quizQuestions[13] = new MultipleChoiceQuestion("What is the name of the common grading scale for "
				+ "rock routes, climbed with a rope, in the US? (answer a, b, etc.)\n a. UIAA \n b. Cracow Scale \n c. Ewbank"
				+ "\n d. Yosemite Decimal System \n", "d");		
		quizQuestions[14] = new MultipleChoiceQuestion("What is the official term for the person responsible"
				+ " for catching a fellow climber using a rope? (answer a, b, etc.)\n a. Mate \n b. Chap \n c. Just that homeless guy"
				+ "\n d. Belayer \n", "d");
		quizQuestions[15] = new MultipleChoiceQuestion("What is a common type of knot climbers use to tie "
				+ "themselves in? (answer a, b, etc.) \n a. Square knot \n b. Overhand knot \n c. Figure 8 follow through \n "
				+ "d. Sheep bend \n", "c");
		quizQuestions[16] = new MultipleChoiceQuestion("What is the name of the climber who has currently "
				+ "established the hardest rock route in the world? (answer a, b, etc.) \n a. Adam Ondra"
				+ "\n b. Chris Sharma \n c. Tommy Caldwell \n d. Alex Megos \n", "a");
		quizQuestions[17] = new MultipleChoiceQuestion("Who was the first climber to ascend the face of El "
				+ "Capital in Yosemite National Park? (answer a, b, etc.) \n a. Royal Robbins \n b. Alex Honnold"
				+ "\n c. Warren Harding \n d. Who Cares!!?? \n", "c");
		quizQuestions[18] = new MultipleChoiceQuestion("What is a term used specifically by climbers that can describe both a rock "
				+ "feature and the weather conditions? (answer a, b, etc.) \n a. Gnarly \n b. Rad \n c. Tubular \n"
				+ " d. Splitter \n", "d");
	
		
		// Fill in the Blank Questions
		
		quizQuestions[19] = new FillInTheBlankQuestion("The type of mountain activity that involves snow travel and ice climbing"
				+ " is called ______________. \n", "Mountaineering");		
		quizQuestions[20] = new FillInTheBlankQuestion("The largest wall of continuous granite in the world is in the country"
				+ " of ________.\n", "Pakistan");
		quizQuestions[21] = new FillInTheBlankQuestion("The name of the largest rock face on the East Coast is ___________."
				+ "\n", "Laurel Knob");
		quizQuestions[22] = new FillInTheBlankQuestion("The style of climbing where you clip quick draws into fixed bolts in the wall"
				+ " for protection is called _____ climbing.\n", "Sport");
		quizQuestions[23] = new FillInTheBlankQuestion("The style of climbing where you place your own gear in weaknesses and features"
				+ " in the rock for protection is called ___________ climbing.\n", "Traditional");
		quizQuestions[24] = new FillInTheBlankQuestion("The style of climbing where you rely entirely on gear you place in the wall to "
				+ "ascend is called ___ climbing\n", "Aid");
		
		
		int length = quizQuestions.length;
		
		for(int i = 0; i < length; i++) {						// Add the questions into the Quiz Class
			quiz.addQuestion(quizQuestions[i]);
		}
		
		
		grade = quiz.giveQuiz();								// Retrieve the Quiz grade
		
		
		NumberFormat pgrade = NumberFormat.getPercentInstance();
		double Tolerance = 0.000001;
		Scanner scan = new Scanner(System.in);
		
		if(Math.abs(100.0 - grade) < Tolerance) {													// If got 100%...
			System.out.println("Holy Cow! You made a " + pgrade.format(grade) + " on the quiz."
					+ " Great Job!!!");
		}
		
		
		else {																							// Otherwise prompt user to initiate print questions with correct answers
			System.out.println("You're Done! You scored a " + pgrade.format(grade) + " on the quiz."
					+ " Press Enter to see which one's you missed");
		
			scan.nextLine();
			System.out.println();
			
			quiz.printWrong();
			
		}
		
		
		
		
	}

}
