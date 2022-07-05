class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        for(int i=0;i <9;i++){
            int[] col=new int[9];
            int[] row=new int[9];
            int[] square=new int[9];
            
         for(int j=0;j <9;j++){
                
            int rowIndex= board[j][i]-'1';
            int colIndex= board[i][j] -'1';
            int squareIndex= board[(3*(i/3)+(j/3))][3*(i%3)+(j%3)] -'1';

             if(rowIndex>=0){
                 row[rowIndex]++;
                 if(row[rowIndex] >1)
                     return false;
             }
            if(colIndex>=0){
                 col[colIndex]++;
                 if(col[colIndex] >1)
                     return false;
             }  
             if(squareIndex>=0){
                 square[squareIndex]++;
                 if(square[squareIndex] >1)
                     return false;
             }
            
        }
        }
        
        return true;
    }
}