class Solution {
    public int[] plusOne(int[] digits) {
        
        
        int carry =1;
        for(int i = digits.length-1; i>=0;i--){
            int temp = digits[i];
            digits[i] = (temp +  carry)%10;  
            carry =  (temp + carry )/10;            
           
            if(carry == 0)
                break;
        }
        //System.out.print(Arrays.toString(backupDigits));
        if(carry != 0){
            int[] backupDigits = new int[digits.length+1];
           backupDigits[0] =1;
            return backupDigits;
        }
        else{
            return digits;
        }
    }
}