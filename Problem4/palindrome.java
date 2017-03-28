import java.util.*;
import java.io.*;

public class palindrome{
	public static void main(String args[]){
		int x,y,z;
		int answer;
		boolean test;
		answer=1;
		for(x=100;x<1000;x++){
			for(y=100;y<1000;y++){
				z=x*y;
				test=isPalindrome(z);
				if(test)
					answer=z;
			}
		}
		System.out.println("The largest palindrome that can be made from two 3-digit numbers is: "+ answer);
	}
	public static boolean isPalindrome(int x){
		// 100*100= 10,000 and 999*999= 998,001
		// Possible values of x are between those two
		int w,y,z;
		int testA, testB;
		w=100000;
		y=10;
		z=1;
		if(x/w>0)
			return sixDigTest(x,w,y,z);
		else{
			return fiveDigTest(x,w/10,y,z);
		}
	}
	public static boolean sixDigTest(int x, int w, int y, int z){
		int testA,testB;
		testA=(x%y)/(y/10);
		if(z>1)
			testB=(x/w)%z;
		else
			testB=x/w;
		if(w<y)
			return true;
		if(testA==testB)
			return sixDigTest(x,w/10,y*10,z*10);
		else
			return false;
	}
	public static boolean fiveDigTest(int x, int w, int y, int z){
		int testA, testB;
		testA=(x%y)/(y/10);
		if(z>1)
			testB=(x/w)%z;
		else
			testB=x/w;
		if(w<y)
			return true;
		if(testA==testB)
			return fiveDigTest(x,w/10,y*10,z*10);
		else
			return false;
	}
}











