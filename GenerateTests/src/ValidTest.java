
public abstract class ValidTest extends Test {

	public ValidTest(String serviceName, String functionName, String dataObjectName, String repositoryName,
			String primaryKeyName) {
		super(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateSignature() {
		return "public void test" + ApplicationFunctions.capitalizeFirstLetter(getFunctionName()) + "Valid() throws Exception {";
	}


	
	

}
