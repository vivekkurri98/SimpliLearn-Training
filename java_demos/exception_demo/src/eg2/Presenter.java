package eg2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		
		FileOperations f = new FileOperations();
		
		try {
			f.openFile("text.txt");
		} catch (FileNotFoundException e) {	
			System.out.println("Sorry unable to open the file");
		}
		
		System.out.println("Other LOC");
	}

}
