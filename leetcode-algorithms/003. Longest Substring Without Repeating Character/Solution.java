class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果map中含有重复的
            if (map.containsKey(s.charAt(i))) {
                //更新标记位置
                temp = Math.max(temp, map.get(s.charAt(i)) + 1);
                //计算当前字符串长度
                if ((i - temp + 1) > answer) {
                    answer = i - temp + 1;
                }
            }
            //如果没有重复的更新字符串长度
            else {
                if ((i - temp + 1) > answer) {
                    answer = i - temp + 1;
                }
            }
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}