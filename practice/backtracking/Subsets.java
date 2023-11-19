//https://practice.geeksforgeeks.org/problems/subsets-1613027340/1?utm_source=youtube&utm_medium=collab_fraz_websitelink&utm_campaign=subsets
package practice.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		int nums[] = {1,2,3};

		List<List<Integer>> subsets = subsets(nums);
		System.out.println(subsets);
	}

	private static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
	    dfs(nums, 0, new ArrayList<>(), ans);
	    return ans;
	}

	private static void dfs(int[] nums, int s, List<Integer> path, List<List<Integer>> ans) {
	    ans.add(new ArrayList<>(path));

	    for (int i = s; i < nums.length; ++i) {
	      path.add(nums[i]);
	      dfs(nums, i + 1, path, ans);
	      path.remove(path.size() - 1);
	    }
	  }

}
