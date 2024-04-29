class Solution {
    
    public static void rotateArray(int[]array,int start,int end){
        while(start<end){
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
        }
        
    }
    
    
    
    
    
    public void rotate(int[] nums, int k) {
        int arrayLength=nums.length;
        k=k%arrayLength;
        arrayLength--;
        rotateArray(nums,0,arrayLength);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,arrayLength);
    }
}