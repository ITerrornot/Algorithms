package com.xc.erfen;
/**
 * ¶ş·Ö²éÕÒ
 * @author 12166
 *
 */
public class HalfSearch {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int b=1;
		System.out.println(searchNumber(a,b));
	}
	public static int searchNumber(int[] a,int b){
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			 if(b<a[mid]){
				high=mid-1;
		}
			else if(b>a[mid]){
				low=mid+1;
			}else
				return mid;
		}
		return -1;
	}
}