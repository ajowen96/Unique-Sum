
public class Logic {
	
	public static int uniqueSum(int firstNumber, int secondNumber, int thirdNumber) {
		int result = 0;
		if (firstNumber == secondNumber && firstNumber == thirdNumber) {
			result = 0;
		}
		else if (firstNumber == secondNumber) {
			result = thirdNumber;
		}
		else if (firstNumber == thirdNumber) {
			result = secondNumber;
		}
		else if (secondNumber == thirdNumber) {
			result = firstNumber;
		}
		else if (firstNumber != secondNumber && firstNumber != thirdNumber) {
			result = firstNumber + secondNumber + thirdNumber;
		}
		return result;
	}
}
