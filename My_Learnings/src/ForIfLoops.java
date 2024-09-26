
public class ForIfLoops {
	public static void main(String[] args) {
		
		//Array
		int[] Array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double[] numbers = {2.5, 9.0, 17.2, 5.0, 3.14};
		
		//Check the Array has multiple of 2
		
		for (int i=0; i<Array1.length; i++)
		{
			if (Array1[i] % 2 == 0)
			{
				System.out.println(Array1[i]);
			}
			else
			{
				System.out.println(Array1[i] + "is not multiple of 2");
			}
		}
		
        //Access and Print
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]); 
 
        //Reverse Order
        System.out.println("Elements in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) 
        {
            System.out.println(numbers[i]);
        }
 
        // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + numbers.length);
	}

}
