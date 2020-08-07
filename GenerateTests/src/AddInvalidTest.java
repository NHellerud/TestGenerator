
public class AddInvalidTest extends InvalidTest {

	private String testAttribute;
	private String testValue;

	public AddInvalidTest(String serviceName, String functionName, String dataObjectName, String repositoryName,
			String primaryKeyName, String errorAppend, String expectedError, String testAttribute, String testValue) {
		super(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName, errorAppend, expectedError);
		this.testAttribute = testAttribute;
		this.testValue = testValue;
	}

	@Override
	public void generateText() {
		getTestText().append(generateSignature());
		getTestText().append("\t" + getDataObjectInstance() + ".set" + ApplicationFunctions.capitalizeFirstLetter(testAttribute)
				+ "(" + testValue + ");").append(System.lineSeparator());
		getTestText().append("\t" +getServiceInstance() + "." + getFunctionName() + "("+ getDataObjectInstance() + ");")
				.append(System.lineSeparator());
		getTestText().append("}").append(System.lineSeparator());

	}

}
