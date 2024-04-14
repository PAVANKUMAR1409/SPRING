package com.pavan;

public class LeetCode2 {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        String s1="", s2="";
        for(String word:word1)
        {
            s1+= word;
        }
        System.out.println(s1);
         for(String s:word2)
        {
            s2+=s;
        }
         System.out.println(s2);
        return s1.equals(s2);   
    }
	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		boolean b= new LeetCode2().arrayStringsAreEqual(word1, word2);
		System.out.println(b);
	}
}
