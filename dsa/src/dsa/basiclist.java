package dsa;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;



public class basiclist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  System.out.print("�ڹ� �迭 ũ�⸦ �Է��ϼ��� : ");
	        
		 
	     BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        
	        int[] test = new int[num];
	        
	        System.out.println("test �迭�� ���̴� " + test.length + " �Դϴ�.");
	        
	        for(int i=0; i<num; i++) {
	            System.out.print("test[" + i + "] �� ���� �Է��ϼ��� :");
	            test[i] = Integer.parseInt(br.readLine());
	        }
	        
	        for(int i=0; i<num; i++) {
	            System.out.println("test[" + i + "] �� ���� " + test[i] + " �Դϴ�.");
	        }
		}
	
}
