import java.util.ArrayList;
import java.util.List;

public abstract class Parameters {

	private String name;
	private Integer min;
	private Integer max;
	public Parameters(String name,  Integer min, Integer max) {
		super();
		this.name = name;
		this.min = min;
		this.max = max;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	
	
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public abstract List<Test> generateTests(String serviceName, String functionName, String dataObjectName, String repositoryName, String primaryKeyName);	
	
}
