/*
1 
2 3 
4 5 6 
7 8 9 10 
 */
package org.pyramid;

public class PyramidNumber {
	public static void main(String[] args) {
		int r=4,num = 1;
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}
}

