/*	Problem 5 by Sebastian Patino

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

*/
import java.io.*;
import java.util.*;

public class smallestMultiple{
	public static void main(String args[]){
		int x,y,z;
		x=21;
		y=1;
		boolean stop=false;
		while(!stop){
			if(x%y==0)
				y++;
			else{
				x++;
				y=1;
			}
			if(y==20)
				stop=true;
			
		}
		System.out.println("Smallest positive number evenly divisible by numbers 1 to 20 is: "+ x);
	}
}