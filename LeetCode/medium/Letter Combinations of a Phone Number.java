class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");     
        List<String> list = new ArrayList<>();
        if(digits.length()==0) {
            return list;
        }
        list.add("");
        for(int i=0; i<digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            String substr = map.get(digits.charAt(i));            
            for(String str: list) {
                for(int j=0; j<substr.length(); j++) {
                    String strsum = str + substr.charAt(j);
                    temp.add(strsum);
                }
            }
            list = temp;
        }
        return list;
    }
}
