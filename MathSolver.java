/**************************************************************************/
/* This program performs arithemic operating on any giving interger.
/* Coded by: Evense Zetrenne
/**************************************************************************/

public class MathSolver {
	public static void main(String[] args) {

		int myNumber = 13;
    int stepOne = (myNumber * myNumber);  
		int stepTwo = (stepOne + myNumber);
    int stepThree = (stepTwo / myNumber);
    int stepFour = (stepThree + 17);
    int stepFive = (stepFour - myNumber);
    int stepSix = (stepFive / 6);
    
    System.out.println(stepSix);
	}
}