package filehandl;

import java.util.Scanner;

public class subarradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,mis=0,carr=0;
		System.out.println("Enter the value of array : ");
		Scanner o=new Scanner(System.in);
	
		n=o.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Unshorted array: ");
		
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		
		}
		
		for(i=0;i<n;i++) {
			for(j=i;j<n;i++) {
				carr=carr+a[j];
				if(carr>mis) {
					mis=carr;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		
		
	

	}

}
