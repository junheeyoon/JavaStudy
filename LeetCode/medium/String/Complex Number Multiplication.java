class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String str1[]=num1.split("[+i]");
        String str2[]=num2.split("[+i]");
        int real1 = Integer.parseInt(str1[0]);
        int img1 = Integer.parseInt(str1[1]);
        
        int real2 = Integer.parseInt(str2[0]);
        int img2 = Integer.parseInt(str2[1]);
        
        return (real1 * real2 - img1 * img2) + "+" +(real1 * img2 + img1 * real2) + "i";
    }
}
