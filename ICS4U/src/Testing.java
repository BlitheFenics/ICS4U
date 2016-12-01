
import java.util.Scanner;

public class Testing {
	
	//Creates the main method and all the variables that will be needed
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int target = 10;
		int startIndex = 0;
		int endIndex = Search.num.length-1;
		int midIndex = (startIndex + endIndex / 2);
		int a = 0;
		String answer;
		
		//ask if they want linear or binary search
		System.out.println("Would you like to search for a number or sort a number?");
		answer = in.nextLine();
		
		if (answer.equalsIgnoreCase("sort")){
			System.out.println("Would you like to use insertion sort, selection sort, bubble sort, merge sort, or quick sort?");
			answer = in.nextLine();
			
			if (answer.equalsIgnoreCase("Insertion")){
				System.out.println("Would you like the int, string, or double insertion sort?");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("int")){
					Sort.InsertionSort(Search.num);
					for(int i=0; i<Search.num.length; i++)
					{
						System.out.println(Search.num[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("double")){
					Sort.InsertionSort(Search.num2);
					for(int i=0; i<Search.num2.length; i++)
					{
						System.out.println(Search.num2[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("string")){
					Sort.InsertionSort(Search.num3);
					for(int i=0; i<Search.num3.length; i++)
					{
						System.out.println(Search.num3[i] + ",");
					}
				}
			}
			else if (answer.equalsIgnoreCase("Selection")){
				System.out.println("Would you like the int, string, or double Selection sort?");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("int")){
					Sort.SelectionSort(Search.num);
					for(int i=0; i<Search.num.length; i++)
					{
						System.out.println(Search.num[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("double")){
					Sort.SelectionSort(Search.num2);
					for(int i=0; i<Search.num2.length; i++)
					{
						System.out.println(Search.num2[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("string")){
					Sort.SelectionSort(Search.num3);
					for(int i=0; i<Search.num3.length; i++)
					{
						System.out.println(Search.num3[i] + ",");
					}
				}
			}
			else if (answer.equalsIgnoreCase("Bubble")){
				System.out.println("Would you like the int, string, or double Bubble sort?");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("int")){
					Sort.BubbleSort(Search.num);
					for(int i=0; i<Search.num.length; i++)
					{
						System.out.println(Search.num[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("double")){
					Sort.BubbleSort(Search.num2);
					for(int i=0; i<Search.num2.length; i++)
					{
						System.out.println(Search.num2[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("String")){
					Sort.BubbleSort(Search.num3);
					for(int i=0; i<Search.num3.length; i++)
					{
						System.out.println(Search.num3[i] + ",");
					}
				}
			}
			else if (answer.equalsIgnoreCase("Merge")){
				System.out.println("Would you like the int, string, or double merge sort?");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("int")){
					Sort.mergeSort(Search.num, null);
					for(int i=0; i<Search.num.length; i++)
					{
						System.out.println(Search.num[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("double")){
					Sort.mergeSort(Search.num2, null);
					for(int i=0; i<Search.num2.length; i++)
					{
						System.out.println(Search.num2[i] + ",");
					}
				}
				//else if (answer.equalsIgnoreCase("String")){
					//Sort.mergeSort(Search.num3);
				//}
			}
			else if (answer.equalsIgnoreCase("Quick")){
				System.out.println("Would you like the int, string, or double quick sort?");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("int")){
					Sort.quickSort(Search.num, a, a);
					for(int i=0; i<Search.num.length; i++)
					{
						System.out.println(Search.num[i] + ",");
					}
				}
				else if (answer.equalsIgnoreCase("double")){
					Sort.quickSort(Search.num2, a, a);
					for(int i=0; i<Search.num2.length; i++)
					{
						System.out.println(Search.num2[i] + ",");
					}
				}
				//else if (answer.equalsIgnoreCase("String")){
					//Sort.quickSort(Search.num3);
				//}
			}
		else if (answer.equalsIgnoreCase("search")){
			System.out.println("Would you like to Binary search or Linear search for your Targe number?");
			answer = in.nextLine();
		
			//ask if they want the double string or int variant of the linear search
		
			if (answer.equalsIgnoreCase("Linear")){
				System.out.println("Would you like they 'int', 'string', or 'double' which version?");
				answer = in.nextLine();
			
				if (answer.equalsIgnoreCase("int")){
					Search.LinearSearch(a, target);
				}
			
				else if (answer.equalsIgnoreCase("double")){
					Search.LinearSearch(a, target);
				}
				else if (answer.equalsIgnoreCase("string")){
					Search.LinearSearch(a, target);
				}
			}
			//does the same as before but with binary search
			else if (answer.equalsIgnoreCase("Binary")){
				//Search.BinarySearch(a, target);
			}
		}
	  }
    }
}

		
	
