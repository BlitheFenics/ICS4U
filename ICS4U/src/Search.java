
public class Search {
	static Integer[] num = {7,29,11,1,9,20,4,10,2,42};
	static double num2[] = {7.5,29.5,11.5,1.5,9.5,20.5,4.5,10.5,2.5,42.5};
	static String[] num3 = new String[]{"7","29","11","1","9","20","4","10","2","42"};
		
	//public static binarySearch(int[]a, int target){
		
		//return binarySearch(a, target, a.length-1);
		
	//}

	//creates the method in which linear will actually search for a given number at an index location
	
	public static int LinearSearch(int a, int target){
			
		for (int i = 0; i< num.length; i++){
			if (num[i].equals(10)){
				System.out.print("Found at spot" + i);
				break;
					
			}
		}
		return LinearSearch(a, target);		
	}
	
	private static int LinearSearch(int a,int target, int startIndex, int endIndex) {
		return LinearSearch(a, target);
	}
		
	public static String LinearSearch(String[]a, String target){
			
		for (int i = 0; i< num3.length; i++){
			if (num3[i].equals(10)){
				System.out.print("Found at spot" + i);
				break;
			}
		}
		return LinearSearch(a, target);	
	}
		
	private static String LinearSearch(String[] a, String target, String startIndex, String endIndex) {
		return LinearSearch (a, target);
	}

	public static Double LinearSearch(Double[]a, Double target){
			
		for (int i = 0; i< num2.length; i++){
			if (num2[i] == (10)){
				System.out.print("Found at spot" + i);
				break;
			}
		}
		return LinearSearch(a, target);	
	}
	
	private static double LinearSearch(Double[]a, Double target, Double startIndex, Double endIndex){
		return LinearSearch (a, target);
	}
}


