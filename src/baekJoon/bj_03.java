package baekJoon;

import java.util.Scanner;

public class bj_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n]; 
		int temp =0;
		
		for(int i=0; i <nums.length; i++) {
			nums[i]= scanner.nextInt();
		}
		
		for(int j=0; j<nums.length-1; j++) {
			for(int k=j+1;k<nums.length; k++) {
				if(nums[j]>nums[k]) {
					temp = nums[j];
					nums[j] = nums[k];
					nums[k] = temp;
				}
			}
		}
		for(int a:nums) {
			System.out.println(a);
		}
	}
}
