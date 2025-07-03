package com.nit.cs.leetcode;

public class isArmstrong {
	
	public static boolean isArmstrongNum(int num) {
		
		if(num>=1 && num<10) {
			return true;
		}else {
			int count = countDigits(num);
			int res = getNumber(count, num);
			
			if(num == res)
				return true;	
		}
		
		return false;
	}
	
	private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
	
	private static int getNumber(int pwr , int num) {
		int digit=0;
		int power=0;
		int res =0;
		while(num!=0) {
			digit = num%10;
			num= num/10;
			 power = getPower(digit, pwr);
			res= res+power;
			}
		return res;
	}
	
	private static int getPower(int num , int pwr) {
		int power=1;
		for(int i=1 ; i<= pwr;i++) {
			power = power*num;
		}
		return power;
	}
	
	public static void main(String[] args) {
		
		int num =370;
		
		if(isArmstrongNum(num)) {
			System.out.println( num+ "  Is Armstrong Number");
		}else {
			System.out.println(num +" Is Not Armstrong Number");
		}
	}

}

/*
 * if(num>=10 && num<100) {
			pwr=2;
			res= getNumber(pwr , num);
			if(num == res) {
				return true;
			}
		}else if(num>=100 && num<1000) {
			pwr=3;
		res= getNumber(pwr , num);
			if(num == res) {
				return true;
			}
		}
		*/
