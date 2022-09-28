package com.javaworld;

public class MaxumunNumberOfJump {

	static int minJumps(int[] arr){
        int i = 0;
       
       int n = arr.length;
      
       if((n==0) || (n==1)){
           return 0;
       }
       
      
      int nextStep = 0;
       int step = 0;
       int jump = 0;
       while(i<n-1){
           
       step = Math.max(step,i+arr[i]);
               if(i == nextStep){
                   nextStep = step;
                   jump++;
               }
               if( nextStep >= arr.length-1 ) return jump; 
               
           i++;
        
       }
       return -1;
           
   }

	public static void main(String[] args) {
    
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	int i=	minJumps(arr);
	System.out.println(i);
	}

}
