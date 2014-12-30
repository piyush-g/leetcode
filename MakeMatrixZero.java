public class MakeMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int colomn = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] colomns = new boolean[colomn];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colomn;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i] = true;
                    colomns[j] = true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colomn;j++)
            {
                if(rows[i] || colomns[j])
                    matrix[i][j]=0;
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = {{0}};
        setZeroes(matrix);
    }
}