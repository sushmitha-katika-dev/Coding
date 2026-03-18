public class FindEquilibriumIdx {

    public static int findEqulibriumIdx(int[] nums){

        /* for(int i = 0; i < nums.length-1 ;i++){
            int leftSum = 0;
            int rightSum = 0;

            for(int j = 0; j < i;j++){
                leftSum += nums[j];
            }

            for(int j = nums.length-1; j > i ;j--){
                rightSum += nums[j];
            }
            
            if(leftSum == rightSum){
                return i;
            }
            
        } */
        
        int totalSum = 0;
        for(int i = 0;i < nums.length;i++){
            totalSum += nums[i];
        }
        int rightSum = totalSum;
        int leftSum = 0;

        for(int i = 0; i < nums.length;i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};  // Array with values
        System.out.print(findEqulibriumIdx(arr));

    }
}
