package com.greatlearning.BinarySearch;

import com.greatlearning.MergeSort.MergeSort;

public class BinarySearch {
	 public static void binarySearch(double arr[], int left, int right, double key){
    	   MergeSort.MergeSortAscending.mergeSort(arr,left, right);
    	      double[] SortedArray=new double[arr.length];
    	      for(int i=0;i<arr.length;i++) {
    	    	  SortedArray[i]=arr[i];
    	      }
    	      
    	      SortedBinarySearch(SortedArray,0,SortedArray.length-1,key);
	 }
           
	private static void SortedBinarySearch(double[] sortedArray, int l, int r, double key) {
			   while(l<=r) {
				    int mid=(l+r)/2;
			     if(key==sortedArray[mid]) {
				    System.out.println("Stock of value " + key + " is present");break; 
			     }
			     else if(key<sortedArray[mid]) {
			    	 r=mid-1;
			     }
			     else {
			    	 l=mid+1;
			     }
			   }
			   if(l>r) {
				   System.out.println("Value not found");
			   }
			  
	}
}	 