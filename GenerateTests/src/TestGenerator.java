
public class TestGenerator {

	static Service service;
	static Parameters param;
	
	public static void main(String[] args) {
		service = new Service("StateService", "State", "StateRepository");
		param = new StringParameter("abbreviation", 2, 10, false);
		service.addParameter(param);
		service.addParameter(new StringParameter("name", 1, 10, false));
		service.GenerateAdd("addState");
//		
//		AddValidTest myTest = new AddValidTest("StateService", "addState", "State", "StateRepository", "abbreviation");
//		myTest.generateText();
//		System.out.println(myTest.getTestText().toString());
//		
//		AddInvalidTest myTest2 = new AddInvalidTest("StateService", "addState", "State", "StateRepository", "abbreviation", "NullInput", "InvalidInputException.class", "Name", "\"\"");
//		myTest2.generateText();
//		System.out.println(myTest2.getTestText().toString());
		
	}
}
