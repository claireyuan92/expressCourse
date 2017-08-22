public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
	if (matrix.length == 0 || matrix[0].length == 0) return -1;
	int row_num = matrix.length;
	int col_num  = matrix[0].length;
	int row = k/col_num - 1;
	int col = k%col_num != 0? k%col_num - 1: col_num - 1; 
	return matrix[row][col];
    }
}
