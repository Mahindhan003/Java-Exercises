import java.util.Arrays;

public class SearchElement {

    static int[] searchNum(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int target=9;
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int[] result=searchNum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
