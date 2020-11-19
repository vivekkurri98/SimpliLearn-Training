package eg3;

import customexception.BusinessException;
import customexception.InvalidAgeException;

public class PresentationLayer {

	public static void main(String[] args) {
		BusinessLayer b = new BusinessLayer();

		try {
		if(b.isValidAge(30)) {
			System.out.println("Age Validated");
		}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(b.isValidPan("ESFPK8924C")) {
				System.out.println("PAN Validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(b.isValidMobileNumber("9833981882")) {
				System.out.println("Mobile Number Validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
