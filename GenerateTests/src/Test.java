
public abstract class Test {

	private StringBuilder testText = new StringBuilder();
	
	private String serviceName;
	private String functionName;
	private String dataObjectName;
	private String repositoryName;
	
	
	private String primaryKeyName;
	
	public String getDataObjectInstance() {
		return "test"+ dataObjectName;
	}
	
	public  void generateText() {
		testText.append("@Test").append(System.lineSeparator());
	}
	
	public String getRepositoryInstance() {
		return ApplicationFunctions.lowercaseFirstLetter(repositoryName);
	}

	public abstract String generateSignature();
	
	public String getServiceInstance() {
		return ApplicationFunctions.lowercaseFirstLetter(serviceName);
	}
	
	public String getPrimaryKey() {
		return  ".get" + ApplicationFunctions.capitalizeFirstLetter(primaryKeyName) + "()";
	}

	public StringBuilder getTestText() {
		return testText;
	}

	public void setTestText(StringBuilder testText) {
		this.testText = testText;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getDataObjectName() {
		return dataObjectName;
	}

	public void setDataObjectName(String dataObjectName) {
		this.dataObjectName = dataObjectName;
	}

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public String getPrimaryKeyName() {
		return primaryKeyName;
	}

	public void setPrimaryKeyName(String primaryKeyName) {
		this.primaryKeyName = primaryKeyName;
	}

	public Test(String serviceName, String functionName, String dataObjectName, String repositoryName,
			String primaryKeyName) {
		super();
		this.serviceName = serviceName;
		this.functionName = functionName;
		this.dataObjectName = dataObjectName;
		this.repositoryName = repositoryName;
		this.primaryKeyName = primaryKeyName;
	}
	
	
}
