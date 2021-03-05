class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix);
        reflect(matrix);
    }
    public static void transpose(int[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=i;j<matrix.length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void reflect(int[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
    }
}
