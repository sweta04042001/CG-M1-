package m1Question;
import java.util.ArrayList;
import java.util.HashMap;
 class Almanac {
 HashMap<String,ArrayList<String>> projects=new HashMap<>();
 public String assignProject(String name,String project) {
	 if(!(projects.containsKey(name))) {
		 ArrayList<String>list=new ArrayList<>();
		 list.add(project);
		 projects.put(name, list);
	 }
	 else {
		 ArrayList<String>n=projects.get(name);
		 n.add(project);
		 projects.put(name, n);
	 }
	 return "Project Assigned Successfully";
 }
 public ArrayList<String>currentProjects(String name){
	 if(projects.containsKey(name)) {
		 return projects.get(name);
	 }
	 else if(projects.get(name).size()==0) {
		 return null;
	 }
	 else
		 return projects.get(name);
	 
 }
 public String finishProject(String name,String project) {
	 if(projects.containsKey(name))
		{
		 ArrayList<String>s=projects.get(name);
		 s.remove(projects);
		 projects.put(name,s);
		 }
	 
	 
 else
	 return "Not Found";
	 return "project finished successfully";
	 }
 
	 
 }
public class Source1{
	public static void main(String args[]) {
		Almanac al=new Almanac();
		System.out.println(al.assignProject("Agent 47", "Mission 20891"));
		System.out.println(al.assignProject("Agent 13", "Mission 20893"));
		System.out.println(al.assignProject("Agent 47", "Mission 20321"));
		
	}
}
