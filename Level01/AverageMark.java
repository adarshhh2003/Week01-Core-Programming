public class AverageMark {
	public static void main(String[] args) {
		// Declare the PCM marks
		int mathMark = 94;
		int physicsMark = 95;
		int chemistryMark = 96;
		
		// Adding total number of marks in PCM and declare the total number of subjects
		int totalMark = mathMark + physicsMark + chemistryMark;
		int numberOfSubjects = 3;
		
		// Calculating the average mark
		double averageMark = totalMark / numberOfSubjects;
		
		// Displaying the result
		System.out.println("Sam's average mark in PCM is " + averageMark);
	}
}