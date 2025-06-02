public class FloorNum {

    static int floorOfNum(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] nums={2,3,5,7,12,35,43,54,57,62};
        int target=15;

        int result= floorOfNum(nums,target);
        System.out.println("Floor of a num:"+result);
    }
}
