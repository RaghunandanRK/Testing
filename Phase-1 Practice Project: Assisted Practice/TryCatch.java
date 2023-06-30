package AssistedPractice;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = { 1, 2, 3, 4, 5 };
	        int index = 5;

	        try {
	            int result = numbers[index];
	            System.out.println("The value at index " + index + " is: " + result);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Invalid index!");
	        } finally {
	            System.out.println("Program execution completed.");
	        }

	}

}
