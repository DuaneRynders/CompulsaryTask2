package people;

public class projectname {
	int projectNumber;//at1
	String projectName;//at2
	String buildingType;//at3
	String phyAdressP;//at4
	int erfNum;//at5
	double totalFee;// 
	double totalAmPaid;
	String deadline;
	private people architect;
	private people customer;
	private people contractor;
	
	
	// Methods
	public projectname(int projectNumber, String projectName, String buildingType, String phyAdressP, int erfNum,double totalFee,double totalAmPaid,String deadline) {
	   this.projectNumber = projectNumber;
	   this.projectName = projectName;
	   this.buildingType = buildingType;
	   this.phyAdressP = phyAdressP;
	   this.erfNum = erfNum;
	   this.totalFee = totalFee;
	   this.totalAmPaid = totalAmPaid;
	   this.deadline = deadline;
	   
	}
	public void setDuedate(String dueDate) {
		deadline = dueDate;
	}
	public void setTotalamP(String totalAmP2) {
		 String totalAmP = totalAmP2;
	}
	public int getNumber() {
	   return projectNumber;
	}
		
	public String getRegistrationClass() {
	   return phyAdressP;
	}
	public void setCustomer(people cust) {
		
		customer = cust;
	}
	public void setArchitect (people arc) {
		architect = arc;
	}
	public void setContractor (people cont) {
		contractor = cont;
	}
	public people getCustomer() {
		return customer;
	}
	public people getArchitect() {
		return architect;
	}
	public people getContractor() {
		return contractor;
	}
	
	public String toString() {
	   String output = "Name: " + getNumber();
	   output += "\nprojectName:" + projectName;
	   output += "\nBuilding Type:" + buildingType;
	   output += "\nProject physical address:" + phyAdressP;
	   output += "\nERF Number: erf" + erfNum;
	   output += "\nTotal Fee: R" + totalFee;
	   output += "\nTotal Amount Paid: R" + totalAmPaid;
	   output += "\nProject deadline : R" + deadline;
	
	   return output;
	}

}
