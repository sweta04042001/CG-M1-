//all spanish return the count of dishes having String s in name
package m1Question;
import java.util.*;
import java.util.List;

class Dish {
	String dishName;
	public Dish(String dishName) {
		super();
		this.dishName=dishName;
		
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName=dishName;
	}
	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + "]";
	}


}
class DishTest{
	public List<Dish> addYummyToName(List<Dish>list){
		List<Dish> dishList=new ArrayList<>();
		
		for(Dish d:list) {
			Dish dish=new Dish("Yummy: "+d.getDishName());
			dishList.add(dish);
		}
		return dishList;
	}
	public long count(List<Dish>list,String s) {
		long count=0;
		for(Dish d:list) {
			if(d.getDishName().contains(s)) {
				count=count+1;
				
			}
		}
		return count;
	}
}

	public class Source2{
		public static void main(String args[]) {
			DishTest dt=new DishTest();
			List<Dish> list=new ArrayList<Dish>();
			list.add(new Dish("Gazpacho"));
			list.add(new Dish("Tamon"));
			list.add(new Dish("Tortilla"));
			list.add(new Dish("Gazpacho"));
			System.out.println(dt.addYummyToName(list));
			System.out.println(dt.count(list,"S"));
			
			
			
		}
}
