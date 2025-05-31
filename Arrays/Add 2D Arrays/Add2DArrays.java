import java.util.Arrays;

public class Add2DArrays {

    static int[][] sum(int[][] arr1,int[][] arr2){
        int[][] sum=new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int[][] num1={{1,2,3},{1,2,3},{1,2,3}};
        int[][] num2={{4,5,6},{4,5,6},{4,5,6}};
        int[][] result=sum(num1,num2);
        System.out.println(Arrays.deepToString(result));
    }
}
