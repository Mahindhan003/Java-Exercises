public class OrderAgnosticBS {

    static int orderAgnoBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;
                }

                }
            else{
                    if(target>arr[mid]){
                        end=mid-1;
                    } else {
                        start=mid+1;
                    }

                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,8,9};
        int target=6;

        int result=orderAgnoBS(nums,target);
        System.out.println(result);
    }
}
