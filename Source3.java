// hard work - validate project name and working hr whichi is more than 30 ; initailize bonus return a msg congrats;if not return work hard;if congrats then return the name of project with working hr; or baaki dekh lo.
package m1Question;
import java.util.*;
import java.util.Arrays;

class Employee {
	public String name;
	public String projectName;
	public int workingHrs;
	public int bonus;
	public Employee(String name,String projectName,int workingHrs) {
		super();
		this.name=name;
		this.projectName=projectName;
		this.workingHrs=workingHrs;
		this.bonus=0;
	}
	public String setBonus() {
		List<String> list=Arrays.asList("web","tech","hack","SD","PD");
		if(list.contains(projectName)&&workingHrs>=30) {
			bonus=workingHrs/10;
			return "congrats";}
		else
			return "work  hard";
	}
	public String checkName() {
		if(name=="doselect") 
			return projectName+workingHrs;
		else
			return projectName+bonus;
			
		}
	}
public class Source3{
	public static void main(String args[]) {
		Employee employee=new Employee("doselect","hack",45);
		System.out.println(employee.setBonus());
		System.out.println(employee.checkName());
	}
	

}
