class Solution {
    public int reverse(int x) {
        long reverse = 0;
        
        while(x != 0){
            reverse = (reverse*10) + x % 10;
            x /= 10;
        }
        //System.out.println(reverse);
        // 자바의 경우 Integer는 32비트 고정이라 이런 식이 필요 없지만, 
        // Integer.MAX_VALUE, Integer.MIN_VALUE가 64비트값이라면 이런식으로 처리해주면 된다.
        double MIN_32BIT_INT = Math.pow( -2, 31 );
        double MAX_32BIT_INT = Math.pow(  2, 31 ) - 1;
        if( reverse < MIN_32BIT_INT || MAX_32BIT_INT < reverse ){
            return 0;
        }
        return (int)reverse;
    }
}
