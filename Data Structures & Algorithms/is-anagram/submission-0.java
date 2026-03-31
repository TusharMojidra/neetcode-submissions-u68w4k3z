class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
            
        }
    
    public static void main(String[] args) {
    String s = "racecar";
     String t = "carrace";
     boolean result = isAnagram(s, t);
     System.out.println(result);
  }
}
