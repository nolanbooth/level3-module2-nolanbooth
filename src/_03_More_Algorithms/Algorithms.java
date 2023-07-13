package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int answer = num1 * num2;
		String stringAnswer = num1 + " x " + num2 + " = " + answer;
		
		return stringAnswer;
	}

	public static boolean isPrime(int num) {
		for(int i = 2; i < (num/2)+1; i++) {
			if(num%i == 0) {
				return false;
			}
		}
	
		return true;

	}

	public static boolean isSquare(int num) {
	
	return false;
	}

	public static boolean isCube(int num) {
		return false;
	}

	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		return 0;
	}

	public static double findTallest(List<Double> peeps) {
		return 0.0;
	}

	public static String findLongestWord(List<String> words) {
		return null;
	}

	public static boolean containsSOS(List<String> message1) {
		return false;
	}

	public static double sortScores(List<Double> results) {
		return 0.0;
	}

	public static String sortDNA(List<String> unsortedSequences) {
		return null;
	}

	public static String sortWords(List<String> words) {
		return null;
	}
}
