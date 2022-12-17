public class Solution {
    public boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = getHash(s);
        HashMap<Character, Integer> map2 = getHash(t);
        return map1.equals(map2);
    }
    public HashMap<Character, Integer> getHash(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else {
                map.put( s.charAt(i),x.get(s.charAt(i))+1);
            }
        }
        return map;
    }
}
