class Solution {
    public double average(int[] salary) {
        double total = 0;
        double min = salary[0];
        double max = 0;
        for(int i=0; i<salary.length; i++){
            total += salary[i];
            min = Math.min(salary[i], min);
            max = Math.max(salary[i], max);
        }
        return (total-(min+max))/(salary.length-2);
    }
}