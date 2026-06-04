class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> ans = new ArrayList<>();
       int m=matrix.length, n=matrix[0].length;
       int firstrow=0,lastrow=m-1,firstcolumn=0,lastcolumn=n-1;
       while(firstrow<=lastrow && firstcolumn<=lastcolumn)
       {
        for(int j=firstcolumn;j<=lastcolumn;j++)
        ans.add(matrix[firstrow][j]);
        firstrow++;
        if (firstrow>lastrow || firstcolumn > lastcolumn)
        break;  
        for(int i=firstrow;i<=lastrow;i++)
        ans.add(matrix[i][lastcolumn]);
        lastcolumn--;
        if (firstrow>lastrow || firstcolumn > lastcolumn)
        break;  
        for(int j=lastcolumn;j>=firstcolumn;j--)
        ans.add(matrix[lastrow][j]);
        lastrow--;
        if (firstrow>lastrow || firstcolumn > lastcolumn)
        break;  
        for(int i=lastrow;i>=firstrow;i--)
        ans.add(matrix[i][firstcolumn]);
        firstcolumn++;
        if (firstrow>lastrow || firstcolumn > lastcolumn)
        break;  
        }
        return ans;
    }
}
