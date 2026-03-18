public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0};
        maxProduct(nums);
    }

    private static void maxProduct(int[] nums) {
        
        int maxProduct = nums[0];
        int arrlen =  nums.length;

        for(int i = 0; i < arrlen ; i++){
            
            int prod = 1;
            
            for(int j = i; j < arrlen ; j++){
                prod *= nums[j];
                maxProduct = Math.max(prod,maxProduct);
            }
        }
        System.out.println(maxProduct);

    }

}


