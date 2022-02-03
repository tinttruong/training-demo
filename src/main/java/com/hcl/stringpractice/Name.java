package com.hcl.stringpractice;

import java.util.StringTokenizer;

public class Name {
	
	public static void main(String[] args) {
		
	String str= "Tin_Trung_Truong";
	StringTokenizer st = new StringTokenizer(str);
	
	String str2 = st.nextToken("_")+ " ";
	
	while(st.hasMoreTokens()) {
		str2 += (st.nextToken("_") + " ");
	}
	System.out.println(str2);
	
	StringBuffer strB = new StringBuffer();
	strB.append(str2);
	strB.append("11/24/1997");
	str2 = strB.toString();
	
	System.out.println(str2);
			
	}

}