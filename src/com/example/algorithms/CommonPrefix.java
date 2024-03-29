package com.example.algorithms;

public class CommonPrefix {
	
	// to resolve leetcode 14: to find the longest common prefix String amongst an array of Strings
	static String getLongestCommonPrefix(String... strs) {
		
		if (strs == null || strs.length == 0)
			return "";
		
		String firstStr = strs[0];
		int lengthOfFirstStr = strs[0].length();
		int lengthOfStrs = strs.length;
		
		for (int i=0; i<lengthOfFirstStr; i++) {
			char tempChar = firstStr.charAt(i);
			for (int j=1; j<lengthOfStrs; j++) {
				if (strs[j].charAt(i)!=tempChar||strs[j].length()==i) {
					return firstStr.substring(0,i);
				}
			}
				
		}
		
		return firstStr;
	}
}
