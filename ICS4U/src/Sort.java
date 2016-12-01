

public class Sort {

	public static Integer[] InsertionSort(Integer[] num) {
		
		
		int i, j, newValue;
	      for (i = 1; i < Search.num.length; i++) {
	            newValue = Search.num[i];
	            j = i;
	            while (j > 0 && Search.num[j - 1] > newValue) {
	                  Search.num[j] = Search.num[j - 1];
	                  j--;
	            }
	            Search.num[j] = newValue;
	      }
		return Search.num;
	}
	
	public static void InsertionSort(double[] num2) {
		
		double i, newValue;
		double j;
	      for (i = (double) 1; i < Search.num2.length; i++) {
	            newValue = Search.num2[(int) i];
	            j = i;
	            while (j > 0 && Search.num2[(int) (j - 1)] > newValue) {
	                  Search.num2[(int) j] = Search.num2[(int) (j - 1)];
	                  j--;
	            }
	            Search.num2[(int) j] = newValue;
	      }
	}
	public static String[] InsertionSort(String[] num3) {
		
		int i;
		String newValue;
		int j;
	      for (i = 1; i < Search.num3.length; i++) {
	            newValue = Search.num3[i];
	            j = i;
	            while (j > 0 && Search.num3[(j - 1)] .compareTo (newValue) >0) {
	                  Search.num3[j] = Search.num3[(j - 1)];
	                  j--;
	            }
	            Search.num3[j] = newValue;
	      }
	      return Search.num3;
	}
	public static Integer[] SelectionSort(Integer[] num){
        
        for (int i = 0; i < Search.num.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < Search.num.length; j++)
                if (Search.num[j] < Search.num[index])
                    index = j;
      
            int smallerNumber = Search.num[index]; 
            Search.num[index] = Search.num[i];
            Search.num[i] = smallerNumber;
        }
        return Search.num;
    }
    
	public static double[] SelectionSort(double[] num2){
        
        for (int i = 0; i < Search.num2.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < Search.num2.length; j++)
                if (Search.num2[j] < Search.num2[index])
                    index = j;
      
            Double smallerNumber = Search.num2[index]; 
            Search.num2[index] = Search.num2[i];
            Search.num2[i] = smallerNumber;
        }
        return Search.num2;
    }
	
	public static String[] SelectionSort(String[] num3){
        
        for (int i = 0; i < Search.num3.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < Search.num3.length; j++)
                if (Search.num3[j] .compareTo([index]) >0);
                    index = j;
      
            String smallerNumber = Search.num3[index]; 
            Search.num3[index] = Search.num3[i];
            Search.num3[i] = smallerNumber;
        }
        return Search.num3;
    }
	
	public static void BubbleSort(Integer[] num) {

	    int n = Search.num.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (Search.num[j - 1] > Search.num[j]) {
	                temp = Search.num[j - 1];
	                Search.num[j - 1] = Search.num[j];
	                Search.num[j] = temp;
	            }
	        }
	    }
	}
	
	public static void BubbleSort(double[] num2) {

	    int n = Search.num2.length;
	    double temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (Search.num2[j - 1] > Search.num2[j]) {
	                temp = Search.num2[j - 1];
	                Search.num2[j - 1] = Search.num2[j];
	                Search.num2[j] = temp;
	            }
	        }
	    }
	}
	public static String[] BubbleSort(String[] num3) {
		
		for (int x = 1; x < Search.num3.length; x++) {
	        for (int y = 0; y < Search.num3.length - x; y++) {
	            if (Search.num3[y].compareTo(Search.num3[y + 1]) > 0) {
	                String temp = Search.num3[y];
	                Search.num3[y] = Search.num3[y + 1];
	                Search.num3[y + 1] = temp;

	            }
	        }
	    }
		return Search.num3;
	}
	public static Integer[] mergeSort(int[] data, int low, int high)
    {
        int middle = (high+low)/2;
        if (low==high)
        {
            Integer[] data2 = new Integer [1];
            data2[0]=data[middle];
            return data2;
        }
        else
        {
            Integer[] firstHalfSorted = mergeSort(data, low, middle);
            Integer[] secondHalfSorted = mergeSort(data, middle+1, high);
            return (mergeSort(firstHalfSorted, secondHalfSorted));
        }
    }

    public static Integer[] mergeSort(Integer[] firstHalfSorted, Integer[] secondHalfSorted)
    {
        mergeSort(null, firstHalfSorted.length + secondHalfSorted.length, 0);
        int m = 0;
        int n = 0;
        int count = 0;
        while (m<firstHalfSorted.length && n<secondHalfSorted.length)
        {
            if (firstHalfSorted[m]>secondHalfSorted[n])
            {
                Search.num[count]=secondHalfSorted[n];
                count++;
                n++;
            }
            else if (firstHalfSorted[m]<secondHalfSorted[n])       
            {
                Search.num[count]=firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (m!=firstHalfSorted.length)
        {
            while(m<firstHalfSorted.length){
                Search.num[count]=firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (n!=secondHalfSorted.length)
        {
            while(n<secondHalfSorted.length){
                Search.num[count]=secondHalfSorted[n];
                count++;
                n++;
            }
        }
        return Search.num;
    }
	public static double[] mergeSort(double data, double low, double high)
    {
        double middle = (high+low)/2;
        if (low==high)
        {
            double[] data2 = new double [1];
            data2[0]=data[middle];
            return data2;
        }
        else
        {
            double[] firstHalfSorted = mergeSort(data, low, middle);
            double[] secondHalfSorted = mergeSort(data, middle+1, high);
            return (mergeSort(firstHalfSorted, secondHalfSorted));
        }
    }

    public static double[] mergeSort(double[] firstHalfSorted, double[] secondHalfSorted)
    {
        mergeSort(null, firstHalfSorted.length + secondHalfSorted.length, 0);
        int m = 0;
        int n = 0;
        int count = 0;
        while (m<firstHalfSorted.length && n<secondHalfSorted.length)
        {
            if (firstHalfSorted[m]>secondHalfSorted[n])
            {
                Search.num2[count]=secondHalfSorted[n];
                count++;
                n++;
            }
            else if (firstHalfSorted[m]<secondHalfSorted[n])       
            {
                Search.num2[count]=firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (m!=firstHalfSorted.length)
        {
            while(m<firstHalfSorted.length){
                Search.num2[count]=firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (n!=secondHalfSorted.length)
        {
            while(n<secondHalfSorted.length){
                Search.num2[count]=secondHalfSorted[n];
                count++;
                n++;
            }
        }
        return Search.num2;
    }
    public static void quickSort(Integer[] num, int start, int end) {
        if (start < end) {
            int partition = partition(Search.num, start, end);
            quickSort(Search.num, start, partition - 1);
            quickSort(Search.num, partition, end);
        }
    }

    public static int partition(Integer[] num, int left, int right) {
        int pivotValue = Search.num[(left + right) / 2]; //Value of middle element in array
        while (left <= right) {
            while (Search.num[left] < pivotValue) {
                left++;
            }
            while (Search.num[right] > pivotValue) {
                right++;
            }
            if (left <= right) {
                /* swap code */
                int temporary = Search.num[left];
                Search.num[left] = Search.num[right];
                Search.num[right] = temporary;

                left++;
                right--;
            }
        }
        return left;
    }
    public static void quickSort(double[] num2, double start, double end) {
        if (start < end) {
            int partition = partition(Search.num2, start, end);
            quickSort(Search.num2, start, partition - 1);
            quickSort(Search.num2, partition, end);
        }
    }

    public static int partition(double[] num2, double left, double right) {
        double pivotValue = Search.num2[(int) ((left + right) / 2)]; //Value of middle element in array
        while (left <= right) {
            while (Search.num2[(int) left] < pivotValue) {
                left++;
            }
            while (Search.num2[(int) right] > pivotValue) {
                right++;
            }
            if (left <= right) {
                /* swap code */
                double temporary = Search.num2[(int) left];
                Search.num2[(int) left] = Search.num2[(int) right];
                Search.num2[(int) right] = temporary;

                left++;
                right--;
            }
        }
        return (int) left;
    }
	
	public static void main(String a[]){
         
        Integer[] num4 = Search.num;
        Integer[] num5 = SelectionSort(num4);
        for(int i:num5){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}


