package eg2;

public class Organization {

	private int orgId;
	private String orgName;
	private String headQuaters;
	
	public Organization() {
		// TODO Auto-generated constructor stub
	}

	public Organization(int orgId, String orgName, String headQuaters) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.headQuaters = headQuaters;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getHeadQuaters() {
		return headQuaters;
	}

	public void setHeadquaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	
	public void printOrganization() {
		System.out.println("Oragnization id: "+orgId);
		System.out.println("Organiztion Name: "+orgName);
		System.out.println("Head Quaters: "+headQuaters);
	}
}
