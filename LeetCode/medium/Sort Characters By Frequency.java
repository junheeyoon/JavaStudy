class Solution {
    public String frequencySort(String s) {
         
        char[] result = new char[s.length()];
        int[][] statistics = new int[255][2];
        for (char c : s.toCharArray()) {
            statistics[c][0]++;
            statistics[c][1] = c;
        }
        int k = 0;
        Arrays.sort(statistics, (o1, o2) -> Integer.compare(o2[0], o1[0]));
        for (int i = 0; i < statistics.length; i++) {
            for (int j = 0; j < statistics[i][0]; j++) {
                result[k++] = (char) statistics[i][1];
            }
        }
        return String.valueOf(result);
        
    }
}
