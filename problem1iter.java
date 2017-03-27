// This is a simple iterative program designed to find the sum of all of the multiples of 3 or 5 that are less than 1000

import java.io.*;
import java.util.*;

public class problem1iter{
	public static void main(String args[]){
		int x,y;
		y=0;
		for(x=1;x<1000;x++){
			if(x%3==0 || x%5==0)
				y=y+x;
		}
		System.out.println("The sum of multiples of 3 or 5 below 1000 is:" + y);
	}
}