
public class SetMatrixZeroes {
	// Problem statement:  https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/
	 public void setZeroes(int[][] matrix) {
	        boolean isCol=false;
	        for(int i=0;i<matrix.length;i++){
	            
	            
	            if(matrix[i][0]==0)
	                isCol = true;
	            
	            
	            
	            for(int j=1;j<matrix[i].length;j++){
	                if(matrix[i][j] == 0){
	                    matrix[0][j]=0;
	                    matrix[i][0]=0;

	                }
	            }
	        }
	        for(int i=1;i<matrix.length;i++){
	            for(int j=1;j<matrix[i].length;j++)
	                if(matrix[i][0]==0||matrix[0][j]==0){
	                    matrix[i][j]=0;
	                    
	                }
	        }
	        if(matrix[0][0]==0){
	            for(int i=1;i<matrix[0].length;i++){
	                matrix[0][i]=0;
	            }
	        }
	    if(isCol){
	        for(int i=0;i<matrix.length;i++){
	                matrix[i][0]=0;
	            }
	        }
	    }
}
