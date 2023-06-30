package AssistedPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            readFile("nonexistentfile.txt");
	        } catch (FileNotFoundException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }

	    public static void readFile(String filename) throws FileNotFoundException {
	        FileReader fileReader = new FileReader(filename);

	}

}
