import java.util.ArrayList;
import java.util.List;

public class StringParameter extends Parameters {

	boolean canBeEmpty;
	
	public StringParameter(String name, Integer min, Integer max, boolean canBeEmpty) {
		super(name, min, max);
		this.canBeEmpty = canBeEmpty;
		
	}

	@Override
	public List<Test> generateTests(String serviceName, String functionName, String dataObjectName, String repositoryName, String primaryKeyName) {
		List<Test> myTests = new ArrayList<>();
		
		
		myTests.add(new AddInvalidTest(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName, "NullInput", "InvalidInputException.class", getName(), "null"));
		
		
		if(!canBeEmpty) {
			myTests.add(new AddInvalidTest(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName, "EmptyInput", "InvalidInputException.class", getName(), "\"\""));		
		}
		
		if(getMin() != null && getMin() > 1) {
			myTests.add(new AddInvalidTest(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName, "InputTooSmall", "InvalidInputException.class", getName(), ApplicationFunctions.generateString(getMin() - 1)));
		}
		
		if(getMax() != null) {
			myTests.add(new AddInvalidTest(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName, "InputTooBig", "InvalidInputException.class", getName(), ApplicationFunctions.generateString(getMax() + 1)));
		}
		return myTests;
	}
	


}
