public class CeilingNum {

    static int ceiling(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] nums={2,4,6,8,14,17,25,31,36,40};
        int target=20;

        int result=ceiling(nums,target);
        System.out.println(result);
    }
}
