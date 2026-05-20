class Solution {
    public boolean hasDuplicate(int[] nums) {
  HashSet<Integer> temp = new HashSet<>();
    for (int s : nums) {
        if (temp.contains(s)) {
            return true;
        }
        temp.add(s);
    }
    return false;
}
}