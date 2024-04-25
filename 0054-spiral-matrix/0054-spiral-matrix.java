class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> new_array=new ArrayList();
        int rows=matrix.length;
        int columns=matrix[0].length;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=columns-1;

        while(left<=right && top<=bottom)
        {
        for(int i=left;i<=right;i++)
        {
            new_array.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            new_array.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--)
        {
            new_array.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
            new_array.add(matrix[i][left]);
        }
        left++;
        }
        }
        return new_array;
    
    }
}