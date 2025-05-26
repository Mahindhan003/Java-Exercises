public class SecondMaxMin {

    static int largest(int[] n){
        int large=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>large){
                large=n[i];
            }
        }
        return large;
    }
    static int smallest(int[] n){
        int small=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<small){
                small=n[i];
            }
        }
        return small;
    }
    static int secondLarge(int[] n){
        int max1;
        int max2;

            if(n[0]>n[1]){
                max1=n[0];
                max2=n[1];
            }
            else{
                max1=n[1];
                max2=n[0];
            }
        for(int i=2;i<n.length;i++){ //3  //20 //5
            if(n[i]>max1){ //3>2   //20>3  //skip..
                max2=max1; //max2=2  //max2=3
                max1=n[i]; //max1=3  //max1=20
            }
            else if(n[i]>max2){  //skip..  //skip..  //5>3
                max2=n[i]; //max2=5
            }
        }
        return max2;

    }

    static int secondSmall(int[] n){
        int min1;
        int min2;

        if(n[0]<n[1]){
            min1=n[0];
            min2=n[1];
        }
        else{
            min1=n[1];
            min2=n[0];
        }

        for(int i=2;i<n.length;i++){
            if(n[i]<min1){
                min2=min1;
                min1=n[i];
            }
            else if(n[i]<min2){
                min2=n[i];
            }
        }
        return min2;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,20,5};
        //Largest Number
        int largest=largest(nums);
        System.out.println("Largest number: "+largest);
        //Smallest Number
        int smallest=smallest(nums);
        System.out.println("Smallest number: "+smallest);
        //Second Largest
        int secondlargest=secondLarge(nums);
        System.out.println("Second Largest: "+secondlargest);
        //Second Smallest
        int secondsmallest=secondSmall(nums);
        System.out.println("Second Smallest: "+secondsmallest);
    }
}
