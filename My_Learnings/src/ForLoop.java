import java.util.ArrayList;
import java.util.List;

public class ForLoop {
	public static void main(String[] args) {
		
		//Array
		int[] Array = new int[5];
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		Array[3] = 40;
		Array[4] = 50;
		
		String[] Name = {"Keerthi", "Monish", "Raj", "Vishnu", "Prabakhar", "Sathya"};
		
		//for loop
		for (int i = 0; i<Array.length; i++)
		{
			System.out.println(Array[i]);
		}
		
		//for loop - String Type 1
		for (int j = 0; j<Name.length; j++)
		{
			System.out.println(Name[j]);
		}
		
		//for loop - String Type 2
		for (String a : Name)
		{
			System.out.println(a);
		}
		
		List<String> a = new ArrayList<String>();
	}

}
