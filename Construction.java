package com.greatlearning.groupassignment.construction;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Construction {
	public  void constructionImplementation(Integer[] array) {
		int counter=0;
		PriorityQueue<Integer> pqueue =new PriorityQueue<Integer>(Collections.reverseOrder());
		pqueue.addAll(Arrays.asList(array));
		for(int i=0;i<array.length;i++) {
		 if(pqueue.peek()==array[i]) {
			System.out.println("Day : "+(i+1));
			 if(counter==i) {
				System.out.println(pqueue.poll());
				counter++;	
			 }
			 else {
				for(int j=counter;j<=i;j++) {
					System.out.print(pqueue.poll()+" ");
					counter++;
                 }
				 System.out.println(" ");
		     }
		
		  } else {	
		  System.out.println("Day : "+(i+1));
		  System.out.println(" ");
		  }
		}
	}

}
