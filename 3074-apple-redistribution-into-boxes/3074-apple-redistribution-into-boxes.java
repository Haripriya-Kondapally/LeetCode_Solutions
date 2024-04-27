class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;
        int total_apples=0;
        for(int i=0;i<n;i++){
            total_apples=total_apples+apple[i];
        }
        Arrays.sort(capacity);
        int minimum_boxes=0;
        for(int i=m-1;i>=0;i-- ){
            minimum_boxes++;
            total_apples=total_apples-capacity[i];
            if(total_apples<=0){
                break;
            }
        }
        return minimum_boxes;
    }
}