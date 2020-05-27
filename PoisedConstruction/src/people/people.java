package people;

public class people {
	String name;//at2
	String telNum;//at5
	String emailAdd;
	String phyAddress;
	public people(String name, String telNum, String emailAdd, String phyAddress){
		   this.name = name;
		   this.telNum = telNum;
		   this.emailAdd = emailAdd;
		   this.phyAddress = phyAddress;
	//able to change set variables
	}
	public void setName(String naming) {
		name = naming; 
	}
	public void setTelNum(String tel) {
		telNum = tel;
	}
	public void setEmail(String email) {
		emailAdd = email;
	}

	public void setAdress(String adress) {
		phyAddress = adress;

	//returning data type
	}
	public String getTel() {
		return telNum;
	}
	public String getEmail() {
		return emailAdd;
	}
	public String getAdress() {
		return phyAddress;

	}
			public String toString() {
			   String output =  " Name: " + name;//type name
			   output += "\n"  + "telephone number,:" + telNum;
			   output += "\n"  + "Email address:" + emailAdd;
			   output += "\n" + "Physical address:" + phyAddress;

			
			   return output;
		
	}


}
