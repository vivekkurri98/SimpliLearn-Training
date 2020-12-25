package char_demos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("char.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				){
			bw.write("Hello from char stream");
			bw.newLine();
			bw.write("This line will be in new Line");
			bw.newLine();
			bw.write("You don't need to convert when doing char stream");
			System.out.println("Info written to file successfully!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
