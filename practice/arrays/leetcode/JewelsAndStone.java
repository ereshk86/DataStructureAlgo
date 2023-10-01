package practice.arrays.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStone {
	public static void main(String[] args) {
		String jewels = "aA";
		String stone = "aAAbbbb";
		int result = numJewelsInStones(jewels, stone);
		System.out.println(result);
	}

	private static int numJewelsInStones(String jewels, String stone) {
		char[] jewelsChar = jewels.toCharArray();
		char[] stoneChar = stone.toCharArray();
		Map<Character, Integer> stoneMap = new HashMap<>();
		for (int i = 0; i < stoneChar.length; i++) {
			if (stoneMap.containsKey(stoneChar[i])) {
				stoneMap.put(stoneChar[i], stoneMap.get(stoneChar[i]) + 1);
			} else {
				stoneMap.put(stoneChar[i], 1);
			}

		}
		int sum = 0;
		for (int i = 0; i < jewelsChar.length; i++) {
			if (stoneMap.containsKey(jewelsChar[i])) {
				sum += stoneMap.get(jewelsChar[i]);
			}
		}
		System.out.println(stoneMap);
		return sum;
		
		
	}
}
