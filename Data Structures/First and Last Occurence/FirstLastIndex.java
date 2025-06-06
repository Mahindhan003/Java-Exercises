import java.util.Arrays;

public class FirstLastIndex {


    static int[] firstLast(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int[] result={-1,-1};

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                result[0]=mid;
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
             start=0;
             end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                result[1]=mid;
                start=mid+1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,2,2,3,3,3,8,9};
        int target=8;

        int[] ans=firstLast(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
