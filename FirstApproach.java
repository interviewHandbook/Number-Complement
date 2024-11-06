package com.interviewprep.leetcode.easy.numbercomplement;

public class FirstApproach {

	public static void main(String[] args) {
		
		int num = 5;
		
		FirstApproach fa = new FirstApproach();
		int comp = fa.findComplement(num);
		
		System.out.println(comp);
		
	}
	
	
	public int findComplement(int num) {
        
		// compute binary of given decimal
		String bin = Integer.toBinaryString(num);
		
		StringBuilder compStr = new StringBuilder();
		
		// compute complement of this binary
		for(int i=0; i<bin.length(); i++) {
			
			if(bin.charAt(i) == '0') {
				
				compStr = compStr.append('1');
			}
			
			if(bin.charAt(i) == '1') {
				
				compStr = compStr.append('0');
			}
		}	
		 
		// return corresponding decimal
		return Integer.parseInt(compStr.toString(),2);
    }

}
