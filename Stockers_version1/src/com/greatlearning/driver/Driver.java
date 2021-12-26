package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.BinarySearch.BinarySearch;
import com.greatlearning.MergeSort.MergeSort;

public class Driver {

	public static void main(String[] args) {
	      
			Scanner in = new Scanner(System.in) ; 
			System.out.println("Enter the no of companies");
			int Num_Companies = in.nextInt();
			double[] Arr=new double[Num_Companies];
			int trues=0;
			int falses=0;
		for(int i=0;i<Num_Companies;i++) {
			int n=i+1;
			System.out.println("Enter current stock price of the company " + n);
			Arr[i]=in.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean compare = in.nextBoolean();
		  if(compare==true) {
			trues=trues+1;
			
			
		  }else {
			 falses=falses+1;
		  }
		}
		    System.out.println("Enter the operation that you want to perform");
	        System.out.println("1.Display the companies stock prices in ascending order");
	        System.out.println("2.Display the companies stock prices in descending order");
	        System.out.println("3.Display the total no of companies for which stock prices rose today");
	        System.out.println("4.Display the total no of companies for which stock prices declined today");
	        System.out.println("5.Search a specific stock price");
	        System.out.println("6.press 0 to exit");
		    int num=in.nextInt();
	    switch(num){
	        case 1 : System.out.println("Stock prices in ascending order are :");
	        	     MergeSort.MergeSortAscending.mergeSort(Arr,0,Arr.length-1);
	                 for(int i=0;i<Arr.length;i++) {
	     				System.out.print(Arr[i] + " ");
	     			 }break;
	        case 2 : System.out.println("Stock prices in descending order are :");
	        	     MergeSort.MergeSortDecscending.mergeSort(Arr,0,Arr.length-1);
                     for(int i=0;i<Arr.length;i++) {
				        System.out.print(Arr[i] + " ");
                     }break;
	        case 3 : System.out.println("Total no of companies whose stock price rose today : " + trues);break;
	        case 4 : System.out.println("Total no of companies whose stock price declined today : " + falses);break;
	        case 5 : System.out.println("Enter the key value");
	                 double key=in.nextDouble();
	                 BinarySearch.binarySearch(Arr, 0, Arr.length-1, key);break;
	        case 6 : System.out.println("0");
	        	     System.out.println("Exited Succesfully");break;
	       default : System.out.println("Invalid option");break;
	        
	   
	      }
		
         
    }

}
