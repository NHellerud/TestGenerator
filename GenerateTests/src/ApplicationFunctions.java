
public class ApplicationFunctions {

	public static String capitalizeFirstLetter(String theString) {
		return theString.substring(0,1).toUpperCase() + theString.substring(1);
	}
	
	public static String lowercaseFirstLetter(String theString) {
		return theString.substring(0,1).toLowerCase() + theString.substring(1);
	}
	
	public static String generateString(int length) {
		String myReturn = ""; 
		for(int i = 0; i < length;i++) {
			myReturn += "z";
		}
		return myReturn;
	}
}
