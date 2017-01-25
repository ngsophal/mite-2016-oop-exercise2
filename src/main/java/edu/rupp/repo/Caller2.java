package edu.rupp.repo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Caller2 extends Caller{
	public static void main(String[] args) throws ParseException{
		ArrayList<String> arrEmployee = new ArrayList<String>();
				
		//Employee
		Employee emp = new Employee();
		
		Date dob = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dob = sdf.parse("2009-11-29");			
		} catch (ParseException e) {
			dob = sdf.parse("0000-00-00");
		}
		emp.firstName = "Sophal";
		emp.lastName = "ngann";
		emp.birthDate = dob;
		emp.salary = 100.5;
		emp.years = (float) 2.3;
		
		//Developer
		Developer dev = new Developer(emp);
		dev.comment = "Testing Developer inheritan-constructor with parameter";
		
		//TeamLeader
		TeamLeader team = new TeamLeader();
		team.firstName = "sok";
		team.lastName = "Sabay";
		team.projectNum = 8;
		
		//add object to ArrayList
		arrEmployee.add(emp.getDataView());
		arrEmployee.add(dev.getDataView());
		arrEmployee.add(team.getDataView());
		
		System.out.printf("List type : ArrayList , total size :%s%n",arrEmployee.size());
		System.out.printf("elements :  %n");
		getDataView(arrEmployee);		
	}
}
