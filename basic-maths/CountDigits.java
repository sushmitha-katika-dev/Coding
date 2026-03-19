class CountDigits {
    public int countDigit(int n) {
        int count = 0;
        if(n == 0){
            count = 0;
        }else{
            n = Math.abs(n);
            while(n > 0){
                n = n/10;
                count++;
            }
        }
        
        return count;
    }
    public static void main(String args[]){
        CountDigits cd = new CountDigits();
        System.out.println(cd.countDigit(234));
    }
}