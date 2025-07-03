package com.cs.finalPractice;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int num) {
		
		
		
		int digit = digitCount(num);
		
		int sum = powerCount(digit , num);
		
		if(sum == num)
			return true;
		return false;
	}
	
	private static int digitCount(int num) {
		 int count =0;
		 int n = num;
		 while(n !=0) {
			 n=n/10;
			 count++;
		 }
		 
		return count;
	}

	private static int powerCount(int digit , int num) {
		 int sum =0;
		
		 int n = num;
		 while(n !=0) {
		
			 int digi = n%10;
			 n=n/10;
			 int newnum=1;
			 for(int i=1 ; i<=digit ; i++ ) {
				 newnum = newnum *digi;
			 }
			
			 sum = sum+newnum;
		 }
		return sum;
	}
	
		public static void main(String[] args) {
			
			int num =153;
			
			if(isArmstrong(num)) {
				System.out.println( num+ "  Is Armstrong Number");
			}else {
				System.out.println(num +" Is Not Armstrong Number");
			}
		}
	
}
