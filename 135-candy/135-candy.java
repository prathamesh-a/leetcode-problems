class Solution {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        int noOfCandies = 0;
        
        for(int i=0; i<candy.length; i++) candy[i] = 1;

        for(int i=1; i<candy.length; i++) if(ratings[i] > ratings[i-1]) candy[i] = candy[i-1] + 1;
        
        for(int i = candy.length-1; i>=1; i--) if(ratings[i] < ratings[i-1] && candy[i-1] <= candy[i]) candy[i-1] = candy[i] + 1;
        
        for(int i : candy) noOfCandies += i;
        
        return noOfCandies;
    }
}