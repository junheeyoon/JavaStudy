class Solution {
    public boolean isPalindrome(int x) {
        int copyval = x;
        if(x < 0){
            return false;
        }
        int sum = 0;
        while(copyval > 0){
            sum = (sum*10) + copyval % 10;
            copyval = copyval / 10;
        }
        if(sum == x){
            return true;
        }
        return false;
    }
}
