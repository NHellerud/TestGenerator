import java.util.ArrayList;
import java.util.List;

public class Service {

	private String name;
	private String dataObjectName;
	private String repositoryName;

	private List<Test> testList = new ArrayList<>();
	private List<Parameters> parameterList = new ArrayList<>();

	public Service(String name, String dataObjectName, String repositoryName) {
		super();
		this.name = name;
		this.dataObjectName = dataObjectName;
		this.repositoryName = repositoryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Parameters> getParameterList() {
		return parameterList;
	}

	public void setParameterList(List<Parameters> parameterList) {
		this.parameterList = parameterList;
	}

	public void addParameter(Parameters theParameter) {
		parameterList.add(theParameter);
	}



	public String getPrimaryKey() {
		return parameterList.get(0).getName();
	}

	public void GenerateAdd(String theFunctionName) {
		
		testList.add(new AddValidTest(getName(), theFunctionName, getDataObjectName(),repositoryName, getPrimaryKey()));
		for(Parameters myParameters:parameterList) {
			testList.addAll(myParameters.generateTests(getName(), theFunctionName, getDataObjectName(), getRepositoryName(), getPrimaryKey()));
		}
		
		for(Test test: testList) {
			test.generateText();
			System.out.println(test.getTestText());
		}
	}

}
