package example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public static void printSpiral(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		int rowBeg = 0;
		int rowEnd = matrix.length - 1;
		int colBeg = 0;
		int colEnd = matrix[0].length - 1;
		
		while(rowBeg <= rowEnd && colBeg <= colEnd) {
			
			for(int i=colBeg; i<=colEnd; i++) {
				res.add(matrix[rowBeg][i]);
			}
			rowBeg++;
			
			for(int i=rowBeg; i<=rowEnd; i++) {
				res.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			if(rowBeg <= rowEnd) {
				for(int i=colEnd; i>=colBeg; i--) {
					res.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;
			
			if(colBeg <= colEnd) {
				for(int i=rowEnd; i>=rowBeg; i--) {
					res.add(matrix[i][colBeg]);
				}
			}
			colBeg++;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		printSpiral(matrix);
	}

}
