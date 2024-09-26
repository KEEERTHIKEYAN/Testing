
public class MetthodsDemo {
	
	public String getdata()
	{
		System.out.println("Selenium Java");
		return "Keerthikeyan K";		
	}
	
	public static void getEmpData() //We don't need to create the Object at the time of using "STATIC"
	{
		System.out.println("Learning Automation");
	}

	public static void main(String[] args) {
		
		MetthodsDemo d = new MetthodsDemo();
		MethodsDemo1 d1 = new MethodsDemo1();
		
		String Name = d.getdata();
		System.out.println(Name);
		
		d1.getUserData();
		getEmpData();

	}

}
