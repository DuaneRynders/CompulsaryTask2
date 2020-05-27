package projectclass;
import java.util.*;

import people.people;
import people.projectname;

public class projectclass {
	public static people getpersonInput(String type) {
		Scanner inputCName = new Scanner(System.in);
		System.out.print("Enter " + type + " name: ");
		String P_Name = inputCName.nextLine();
		Scanner inputPtel = new Scanner(System.in);
		System.out.print("Enter " + type + " telephone number: ");
		String P_tel = inputPtel.nextLine();
		Scanner inputPemailAdd = new Scanner(System.in);
		System.out.print("Enter " + type + " email adress: ");
		String P_Email= inputPemailAdd.nextLine();
		Scanner inputPphyAddress = new Scanner(System.in);
		System.out.print("Enter " + type + " physical adress: ");
		String P_PyAdd= inputPphyAddress.nextLine();
		
		return new people(P_Name, P_tel, P_Email, P_PyAdd);
		
	}
public static projectname getUserinput() {
	projectname project;
	//request user data 
	Scanner inputNumber = new Scanner(System.in);
	System.out.print("Enter project number: ");
	int P_Number = inputNumber.nextInt();
	Scanner inputName = new Scanner(System.in);
	System.out.print("Enter project name: ");
	String P_Name = inputName.next();
	Scanner inputBuildingT = new Scanner(System.in);
	System.out.print("Enter building type: ");
	String P_BuildT = inputBuildingT.next();
	Scanner inputPhyAdd = new Scanner(System.in);
	System.out.print("Enter project adress: ");
	String P_PhyAdd = inputPhyAdd.next();
	Scanner inputErfNum = new Scanner(System.in);
	System.out.print("Enter erf number: ");
	int P_ErfNum = inputNumber.nextInt();
	Scanner inputTotalFee = new Scanner(System.in);
	System.out.print("Enter total fee: ");
	double P_TotalFee = inputNumber.nextDouble();
	Scanner inputTotalAmPaid = new Scanner(System.in);
	System.out.print("Enter total ammount paid: ");
	double P_totalAmPaid = inputNumber.nextDouble();
	System.out.print("Enter project deadline: ");
	String P_deadline = inputPhyAdd.next();
	Scanner inputdeadline = new Scanner(System.in);
	// creating a project 
	project = new projectname(P_Number, P_Name, P_BuildT,P_PhyAdd, P_ErfNum, P_TotalFee, P_totalAmPaid, P_deadline);
	//creating customer
	project.setCustomer(getpersonInput("customer"));
	//creating architect 
	project.setArchitect(getpersonInput("architect"));
	//creating contractor
	project.setContractor(getpersonInput("contractor"));
	
	
	
	
	
	return project;
}
	public static void main(String[] args) {
		
		
		projectname project1 = getUserinput();
		System.out.print("Project details: \n" + project1.toString());
		System.out.print("\n\n Customer details are as follows: \n" + project1.getCustomer().toString());
		System.out.print("\n\n Contractor details are as follows: \n" + project1.getContractor().toString());
		System.out.print("\n\n Architect details are as follows: \n" + project1.getArchitect().toString());
		//set new due date
		System.out.print("\n\n Please enter a new due date: \n");
		Scanner inputdeadline = new Scanner(System.in);
		String P_deadline = inputdeadline.next();
		project1.setDuedate(P_deadline);
		//change total amount of the fee paid 
		System.out.print("\n Please update the total ammount paid: \n");
		Scanner inputupdateFee = new Scanner(System.in);
		String totalAmP = inputdeadline.next();
		project1.setTotalamP(totalAmP);
		//update contractors details
		System.out.print("\n Please update the contractors details: \n");
		Scanner inputuCont = new Scanner(System.in);
		String Cont = inputuCont.next();
		project1.setContractor(getpersonInput("contractor"));
		
		projectname project2 = getUserinput();
		System.out.print("Project details: \n" + project1.toString());
		System.out.print("\n\n Customer details are as follows: \n" + project1.getCustomer().toString());
		System.out.print("\n\n Contractor details are as follows: \n" + project1.getContractor().toString());
		System.out.print("\n\n Architect details are as follows: \n" + project1.getArchitect().toString());
		   }
		}
