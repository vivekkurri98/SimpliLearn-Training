package eg3;

import customexception.BusinessException;
import customexception.InvalidAgeException;

public class BusinessLayer {

	public boolean isValidAge(int age) throws InvalidAgeException, ArithmeticException {
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be -ve or 0");
		}else if(age<18 || age>30) {
			throw new InvalidAgeException("Age should be between 18 and 30 only");
		}
		
		return true;
	}
	
	public boolean isValidPan(String pan) throws BusinessException {
		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			throw new BusinessException("Enter PAN "+pan +" is InValid");
		}
		return true;
	}
	
	public boolean isValidMobileNumber(String number) throws BusinessException {
		if(!number.matches("[6-9]{1}[0-9]{9}")) {
			throw new BusinessException("Entered number "+number+ " is Invalid");
		}
		return true;
	}
}
