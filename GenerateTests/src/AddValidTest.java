import org.junit.runners.model.TestTimedOutException;

public class AddValidTest extends ValidTest {

	public AddValidTest(String serviceName, String functionName, String dataObjectName, String repositoryName,
			String primaryKeyName) {
		super(serviceName, functionName, dataObjectName, repositoryName, primaryKeyName);
		// TODO Auto-generated constructor stub
	}

	// System.out.println(getName() + "." + theFunctionName + "(valid" +
	// getDataObjectName() + ");");
	// System.out.print("\t");
	// System.out.println("assertEquals(valid" + getDataObjectName() + ".get" +
	// getPrimaryKey() + ", "
	// + getRepositoryInstance() + ".getById(" + "valid"
	// + getDataObjectName() + ".get" + getPrimaryKey() + ").get()" + ".get"
	// + getPrimaryKey() + ");");
	// System.out.print("\t");
	// System.out.println(getRepositoryName().substring(0, 1).toLowerCase() +
	// getRepositoryName().substring(1)
	// + ".deleteById(" + "valid" + getDataObjectName() + ".get"
	// + getPrimaryKey()+ ");");
	// System.out.println("}");
	//
	@Override
	public void generateText() {
		super.generateText();
		getTestText().append(generateSignature()).append(System.lineSeparator());
		getTestText()
				.append("\t" + getServiceInstance() + "." + getFunctionName() + "(valid"
						+ ApplicationFunctions.capitalizeFirstLetter(getDataObjectName()) + ");")
				.append(System.lineSeparator());
		getTestText().append("\t" + "assertEquals(valid" + getDataObjectName() + getPrimaryKey() + ", "
				+ getRepositoryInstance() + ".getById(" + "valid" + getDataObjectName() + getPrimaryKey() + ").get()"
				+ getPrimaryKey() + ");").append(System.lineSeparator());
		getTestText().append(
				"\t" + getRepositoryInstance() + ".deleteById(" + getDataObjectInstance() + getPrimaryKey() + ");")
				.append(System.lineSeparator());
		getTestText().append("}").append(System.lineSeparator());

	}

}
