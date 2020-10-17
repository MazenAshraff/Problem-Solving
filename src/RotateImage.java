
public class RotateImage {
	// Problem Statement: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/
    public void rotate(int[][] matrix) {
        int n = matrix.length;
         for(int i=0;i<n/2;i++){
             int last=n-i-1;
             for(int j=i;j<last;j++){
                 int offset=j-i;
                 int temp = matrix[i][j];
                 // top = bot left
                 matrix[i][j]=matrix[last-offset][i];
                 matrix[last-offset][i]=matrix[last][last-offset];
                 matrix[last][last-offset]=matrix[j][last];
                 matrix[j][last]=temp;
             }
         }
     }
}
