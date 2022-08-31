class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        ArrayList<Integer> letters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]))
                letters.add(i);
        }
        this.permutate(result, chars, letters, 0);
        return result;
    }

    private void permutate(List<String> result, char[] chars, ArrayList<Integer> letters, int letterNum) {
        if (letterNum >= letters.size()) {
            result.add(String.valueOf(chars));
            return;
        }
        int pos = letters.get(letterNum);
        permutate(result, chars, letters, letterNum + 1);
        chars[pos] = (char)(chars[pos]^32); // toggle case
        permutate(result, chars, letters, letterNum + 1);
    }
}