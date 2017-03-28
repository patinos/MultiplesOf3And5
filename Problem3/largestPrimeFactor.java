/*	Problem 3 by Sebastian Patino

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?


*/

import java.io.*;
import java.util.*;

public class largestPrimeFactor{
	public static void main(String args[]){
		long x,z;
		z=0;
		long y=600851;
		y=(y*1000000)+475143;
		x=2;
		long small=1;
		boolean prime;
		while(x<=y){
			prime=isPrime(x);
			if(prime && y%x==0){
				small=x;
				y=y/x;
			}
			x++;
		}
		System.out.println("Largest prime factor of 600851475143 is: "+ small);
		
	}
	public static boolean isPrime(long x){
		long y,z;
		y=2;
		while(y<x){
			if(y%x==0)
				return false;
			y++;
		}
		return true;
	}
}