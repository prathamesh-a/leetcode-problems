class Solution {
    private static final char HASH_TAG = '#';
    private Tree root = new Tree();
    
    public List<String> findWords(char[][] board, String[] words) {
        for (String word : words) {
            Tree temp = root;
            // Test case 60/63 
            for (int i = word.length() - 1; i >= 0; i--) {
                int idx = word.charAt(i) - 'a';
                if (temp.val[idx] == null) {
                    temp.val[idx] = new Tree();
                    temp.val[idx].parent = temp;
                    temp.val[idx].idx = idx;
                }
                temp = temp.val[idx];
            }
            temp.word = word;
        }    
        return searchWord(board);
    }
    
    private List<String> searchWord(char[][] board) {
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                Tree temp = root;
                checkWord(res, i, j, board, temp);
            }
        
        return res;
    }
    
    private void checkWord(List<String> res, int y, int x, char[][] board, Tree temp) {
        
        if (x >= board[0].length || x < 0
            || y >= board.length || y < 0)
            return;
        
        char ch = board[y][x];
        if (ch== HASH_TAG || temp.val[ch - 'a'] == null)
            return;
        
        temp = temp.val[ch - 'a'];
        
        if (temp.word != null) {
            res.add(temp.word);
            temp.word = null; // Test case 17/63: When there is more than one answer
            Tree ptr = temp;
            while (ptr.parent != null 
                    && ptr.isEmpty()) {
                int idx = ptr.idx;
                ptr = ptr.parent;
                ptr.val[idx] = null;
            }
        }
        
        board[y][x] = HASH_TAG;

        checkWord(res, y, x + 1, board, temp);
        checkWord(res, y, x - 1, board, temp);
        checkWord(res, y + 1, x, board, temp);
        checkWord(res, y - 1, x, board, temp);
        
        board[y][x] = ch;
    }
    
    class Tree {
        Tree parent;
        Tree[] val = new Tree[26];
        String word;
        int idx;

        public boolean isEmpty() {
            for (int i = 0; i < 26; i++) 
                if (val[i] != null)
                    return false;

            return true;
        }
    }
}


// class Solution {
//     public List<String> findWords(char[][] board, String[] words) {
//         ArrayList<String> list = new ArrayList<>();
        
//         for(String word : words) {

//             if (check(board, word)) list.add(word);
            
//         }
        
//         return list;
//     }
    
//     private boolean check(char[][] board, String word) {
        
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board[0].length; j++) {
                
//                 boolean[][] dp = new boolean[board.length][board[0].length];
//                 boolean res = isWordThere(i, j, board, word, 0, dp);
//                 //for(boolean[] a : dp) System.out.println(Arrays.toString(a));
//                 //System.out.println(i + " " + j);
//                 if (res) return true;
                    
//             }
//         }
//         return false;
        
//     }
    
//     private boolean isWordThere(int i, int j, char[][] arr, String word, int wordIndex, boolean[][] dp) {
//         if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) return false;
        
//         if (dp[i][j]) return false;
//         if (word.charAt(wordIndex) != arr[i][j]) return false;
//         if (wordIndex == word.length()-1 && word.charAt(wordIndex) == arr[i][j]) return true;
        
//         dp[i][j] = true;
            
//         boolean one = isWordThere(i-1, j, arr, word, wordIndex+1, dp);
//         boolean two = isWordThere(i, j+1, arr, word, wordIndex+1, dp);
//         boolean three = isWordThere(i+1, j, arr, word, wordIndex+1, dp);
//         boolean four = isWordThere(i, j-1, arr, word, wordIndex+1, dp);
        
//         return dp[i][j] = (one || two || three || four);
//     }
// }