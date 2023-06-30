package AssistedPractice;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
            String msg = "Welcome to Java!";
            byte[] byteArray = msg.getBytes(); // converting string into byte array
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfully!");
        } catch (IOException exception) {
            System.out.println(exception);
        }

	}

}
