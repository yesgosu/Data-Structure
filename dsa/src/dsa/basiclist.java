package dsa;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;



public class basiclist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  System.out.print("자바 배열 크기를 입력하세요 : ");
	        
		 
	     BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        
	        int[] test = new int[num];
	        
	        System.out.println("test 배열의 길이는 " + test.length + " 입니다.");
	        
	        for(int i=0; i<num; i++) {
	            System.out.print("test[" + i + "] 의 값을 입력하세요 :");
	            test[i] = Integer.parseInt(br.readLine());
	        }
	        
	        for(int i=0; i<num; i++) {
	            System.out.println("test[" + i + "] 의 값은 " + test[i] + " 입니다.");
	        }
		}
	
}
