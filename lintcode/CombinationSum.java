/*
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.



For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 

Example
given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 

Note
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, �� , ak) must be in non-descending order. (ie, a1 �� a2 �� �� �� ak).
The solution set must not contain duplicate combinations.
 */
public class CombinationSum {

    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; ++i) {
            List<Integer> list = new ArrayList<Integer>();
            int sum = 0;
            while (sum < target) {
                list.add(candidates[i]);
                sum += candidates[i];
            }
            if (sum == target) {
                result.add(new ArrayList<Integer>(list));
            }
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }

}
