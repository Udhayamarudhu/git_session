package com.greatlearning.groupassignment.construction;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter the total no of floors in the buiding :");
		 int floors = in.nextInt();
		 Integer[] array = new Integer[floors];
		 for(int i=0;i<floors;i++) {
			 System.out.println("Enter the floor size given on day :"+(i+1));
			 array[i]=in.nextInt();
		 }
		Construction sample = new Construction();
		sample.constructionImplementation(array);
		

	}

}
