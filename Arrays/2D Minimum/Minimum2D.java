public class Minimum2D {

    static int minimum(int[][] arr){
        int mininum=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(mininum>arr[i][j]){
                    mininum=arr[i][j];
                }

            }
        }
        return mininum;
    }
    public static void main(String[] args){
        int[][] nums={{1,2,3},{4,-1,6},{7,8,9}};
        int result=minimum(nums);
        System.out.println(result);
    }
}
