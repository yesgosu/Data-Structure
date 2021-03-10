package re1;

public class re2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][] = new int[][] {{1,2,3,4}
		,{5,6,7,8}};
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) 
				System.out.printf("%d/4ºÐ±â : sale[%d][%d] = %d %n",j+1,i,j,sale[i][j]);
				System.out.println();
			}
		}
	}


