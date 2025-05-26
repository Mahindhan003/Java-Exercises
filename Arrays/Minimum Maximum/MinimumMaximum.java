public class MinimumMaximum {
    public static void main(String[] args) {
        int[] nums={5,3,10,25,16};
        int minimum=nums[0];
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
            if(nums[i]<minimum){
                minimum=nums[i];
            }

        }
        System.out.println("Max: "+maximum);
        System.out.println("Min: "+minimum);
    }
}
