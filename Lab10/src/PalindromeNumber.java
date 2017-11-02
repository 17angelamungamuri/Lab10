import java.util.*;

public class PalindromeNumber extends StackX {
	public PalindromeNumber(int s) {
		super(s);
	}
//checks to see if it is a palindrome
	public boolean checkPalindrome(int product) {
		boolean check = false;
		int newNum = product;
		while (newNum > 0) { //pops each number onto the int array defined in StackX
			this.push(newNum % 10);
			newNum = newNum / 10;
		}
		int compareNum = product;
		while (compareNum > 0) { //compares each element popped to each didgit in the number
			if (this.pop() == compareNum % 10) {
				compareNum = compareNum / 10;
				check = true;
			} else //if one number does not equal, stack is emptied and the check is equal to false
				check = false;
				if(!this.isEmpty())
					this.pop();
			break;
		}
		return check;
	}

	public int product(int num1, int num2) { //makes the product
		return num1 * num2;
	}

	public static void main(String[] args) {
		PalindromeNumber palindrome = new PalindromeNumber(8);
		int num1 = 1000;
		int num2 = 1000; // lowest 4 digit number
		int maxNum = 0;
		for (int i = 1000; i < 10000; i++) { //until number1 equals a five digit number
			for (int j = 1000; j < 10000; j++) {//until number2 equals a 5 digit number
				if (palindrome.checkPalindrome(palindrome.product(num1, num2))) { //multiply and check
					maxNum = palindrome.product(num1, num2); //make max only if it is a palindrome
				}
				num2++; // increase

			}
			num1++; //increase
		}
		System.out.print(maxNum); //print max
	}
}
