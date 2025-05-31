import java.util.Arrays;

public class Add1DArrays {

    static int[] sum(int[] arr1,int[] arr2){
        int[] sum=new int[3];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={4,5,6};
        int[] ans=sum(num1,num2);
        System.out.println(Arrays.toString(ans));
    }
}

