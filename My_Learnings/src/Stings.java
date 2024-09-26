
public class Stings {
	public static void main(String[] args) {
		//String is an object  //String literal
		String s = "Dk Tires";
		String s1 = "Hello";
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s4 = "Rahul Shetty Academy";
		String[] splittedString = s4.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		System.out.println("************************");
		
		String[] splittedString1 = s4.split("Shetty");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		
		System.out.println("************************");
		
		String[] splittedString2 = s4.split(" ");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1].trim());
		
		System.out.println("************************");
		
		for (int i=0; i<s4.length(); i++) //Print a string in Front Order
		{
			System.out.println(s4.charAt(i));			
		}
		
		System.out.println("************************");
		
		for (int i=s4.length()-1; i>=0; i--) //Print a string in Reverse Order
		{
			System.out.println(s4.charAt(i));
		}
	}

}
