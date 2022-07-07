import java.util.*;
public class larg {
	
    public static void main(String[] args) 
    {
        Integer ar[] = new Integer[]{68,45,2,30,100};
        int k = 2;
		System.out.println("Array given: ");
		System.out.println(Arrays.toString(ar));
		System.out.println(k +" largest elements are:");
        Arrays.sort(ar, Collections.reverseOrder());         
       for (int i = 0; i < k; i++) 
          System.out.print(ar[i] + " ");
      }      
  }