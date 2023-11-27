package practice.backtracking;

import java.util.ArrayList;

public class PermutationWithSpaces {
	public static void main(String[] args) {

		System.out.println(permutation("ABC"));
	}
	 static ArrayList<String> permutation(String S){
		ArrayList<String> res = new ArrayList<>();
		String str= "";
		rec(0, str,res, S);
		return res;
		
	}
	private static void rec(int i, String str, ArrayList<String> res, String S) {
		String temp = str;
		if(i == S.length()-1) {
			 temp = str.concat(String.valueOf(S.charAt(i)));
			
			res.add(temp.toString());
			return;
		}
		rec(i+1, temp.concat(String.valueOf(S.charAt(i))).concat(" "), res, S);
		rec(i+1, temp.concat(String.valueOf(S.charAt(i))), res, S);
		
	}
}
