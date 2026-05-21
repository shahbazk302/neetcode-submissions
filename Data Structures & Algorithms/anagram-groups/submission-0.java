class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> arrData = new HashMap<>();
        
        for(int i=0; i < strs.length; i++){
            char[] chr = strs[i].toCharArray();
            Arrays.sort(chr);
            String sortedArrayStr = new String(chr);

            if(!arrData.containsKey(sortedArrayStr)){
                arrData.put(sortedArrayStr,new ArrayList<String>());
            }

            arrData.get(sortedArrayStr).add(strs[i]);


            

            




        }
        return new ArrayList<>(arrData.values());
        
    }
}
