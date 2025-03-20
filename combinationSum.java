public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,8};
        int target = 10;
        combinationSum(candidates, target);
    }
    public static void combinationSum(int[] candidates, int target){
        int[] combination = new int[target]; 
        findCombinations(candidates, target, 0, combination, 0);
    }
    public static void findCombinations(int[] candidates, int target, int index, int[] combination, int pos) {
        if (target == 0) {
      printCombination(combination, pos); 
            return;}
        if (target < 0) return;
     for (int i = index; i < candidates.length; i++) {
                combination[pos] = candidates[i]; 
            findCombinations(candidates, target - candidates[i], i, combination, pos + 1);
        } }
 public static void printCombination(int[] combination, int length) {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(combination[i] + (i < length - 1 ? "," : ""));
        }  System.out.println(" ");
    }
}