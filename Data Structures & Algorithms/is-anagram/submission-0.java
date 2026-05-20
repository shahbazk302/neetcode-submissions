class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character, Integer> data = new HashMap<>();
      for(char c : s.toCharArray()){
        data.put(c, data.getOrDefault(c,0)+1);
      }
      for(char c : t.toCharArray()){
        
        if(data.containsKey(c)){
            data.put(c, data.getOrDefault(c, 0)-1);
        }else{
            return false;
        }

        if(data.get(c)==0){
            data.remove(c);
        }

      }
      
      return data.isEmpty();
      
    }
}
