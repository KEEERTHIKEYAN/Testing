import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		
		//Array List
		ArrayList<String> a = new ArrayList<String>();
		a.add("Keerthi");
		a.add("Monish");
		a.add("Vishnu");
		a.add("Raj");
		
		System.out.println(a.get(3));
		System.out.println("************************");
		
		for (int i = 0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("************************");
		
		for (String value : a)
		{
			System.out.println(value);
		}
		
		System.out.println("************************");
		
		//Find item is present Arraylist or not
		System.out.println(a.contains("Monish"));
		System.out.println(a.contains("Sathya"));
		
		System.out.println("************************");
		
		//Change the Normal Array to Array list
		String[] Name = {"Keerthi", "Raj", "Monish", "Vishnu"};
		List NameArrayList = Arrays.asList(Name); //Changing Array to Array list
		System.out.println(NameArrayList);
		
		for (int i = 0; i<NameArrayList.size(); i++)
		{
			System.out.println(NameArrayList.get(i));
		}
		
		
		
	}

}
