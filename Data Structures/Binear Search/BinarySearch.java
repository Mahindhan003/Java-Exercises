public class BinarySearch {

    static int binarySearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={10,13,16,22,33,56,67,69,73,78,82,91};
        int target=13;
        System.out.println(binarySearch(nums,target));
    }
}
