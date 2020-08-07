
public abstract class InvalidTest extends Test {

	private String errorAppend;
	private String expectedError;
	
	
	public InvalidTest(String serviceName, String functionName, String dataObjectName, String repositoryName,
			String primaryKeyName, String errorAppend, String expectedError) {
		super(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName);
		this.errorAppend = errorAppend;
		this.expectedError = expectedError;
	}

	@Override
	public String generateSignature() {
		StringBuilder mySignature = new StringBuilder();
		mySignature.append("@Test (expected = " + expectedError + ")").append(System.lineSeparator());
		mySignature.append("public void test" + ApplicationFunctions.capitalizeFirstLetter(this.getFunctionName()) + "Invalid"+ errorAppend + "() throws Exception {").append(System.lineSeparator());
		
		return mySignature.toString();
	}

}
