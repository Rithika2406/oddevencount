import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int evenCount = 0; 
		int oddCount = 0;  

		for (int i = 0; i < n; i++) {
			int weapons = sc.nextInt(); 
			if (weapons % 2 == 0) {
				evenCount++; 
			} else {
				oddCount++;  
			}
		}

	
		if (evenCount > oddCount) {
			System.out.println("READY FOR BATTLE");
		} else {
			System.out.println("NOT READY");
		}
	}
}
	