package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
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
		for (int i = 2; i < (num / 2) + 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static boolean isSquare(int num) {
		double number = num;
		double root = Math.sqrt(number);
		int intRoot = (int) Math.sqrt(number);
		if (root == intRoot) {
			return true;
		}

		return false;
	}

	public static boolean isCube(int num) {
		double number = num;
		double cbRoot = Math.cbrt(number);
		int intRoot = (int) Math.cbrt(number);
		if (intRoot == cbRoot) {
			return true;
		}

		return false;
	}

	// EEEEEEEEEEEEEEEEEEEEEEEEEEEEEE

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equalsIgnoreCase("cracked")) {
				return i;
			}
		}

		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearlCount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlCount++;
			}
		}

		return pearlCount;
	}

	public static double findTallest(List<Double> peeps) {
		double tallestPerson = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallestPerson) {
				tallestPerson = peeps.get(i);
			}

		}
		return tallestPerson;
	}

	public static String findLongestWord(List<String> words) {
		String longestString = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestString.length()) {
				longestString = words.get(i);
			}
		}

		return longestString;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}
		}

		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		ArrayList<Double> clone = new ArrayList<Double>(results);
		ArrayList<Double> sortedScores = new ArrayList<Double>();

		double smallestValue;
		john: for (int i = clone.size()-1; i >= 0; i--) {
			smallestValue = 1000;

			for (int k = 0; k < clone.size(); k++) {
				if (clone.get(k) < smallestValue) {
					smallestValue = clone.get(k);
					
				}
			}
			// smallestValue is now the smallest value in the clone array list

			System.out.println(smallestValue);
			// print smallest value
			int smallestIndex = 0;
			bill: for (int j = 0; j < clone.size(); j++) {
				if (clone.get(j) == smallestValue) {
					smallestIndex = j;

					break bill;

				}
				clone.remove(smallestIndex);
			}
			// finds index of smallest value, then removes it
			sortedScores.add(smallestValue);
			// adds smallest value to the sorted Scores array list

			
			// if the size of sorted scores is equal to the size of the results array list,
			// then break the john loop

		}
		
		for(int i = 0; i < sortedScores.size(); i++) {
			System.out.println(sortedScores.get(i));
		}
		return sortedScores;
	}

	public static String sortDNA(List<String> unsortedSequences) {
		return null;
	}

	public static String sortWords(List<String> words) {
		return null;
	}
}
