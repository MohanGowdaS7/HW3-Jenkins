//package com.uttara.col21;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class col21 {
	
	public static void main(String[] args)
	{
		String s1="loki";
		String s2="loki";
		
		System.out.println("s1==s2 "+s1==s2);
		System.out.println("s1.equals(s2) "+s1.equals(s2));
		
		String s3=new String("good");
		String s4=new String("good");
		
		System.out.println("s3==s4 "+s3==s4);
		System.out.println("s3.equals(s4) "+s3.equals(s4));
		System.out.println("s3 hashcode "+s3.hashCode());
		System.out.println("s4 hashcode "+s4.hashCode());
		System.out.println("s1 hashcode "+s1.hashCode());
		System.out.println("s2 hashcode "+s2.hashCode());
		
		HashSet<String> s11=new HashSet<String>(); 
		s11.add(s1);
		s11.add(s2);
		System.out.println("the content of hashset "+s11);
		
		TreeSet<String> s111=new TreeSet<String>();
		s111.add(s1);
		s111.add(s2);
		System.out.println("the contant in TreeSet "+s111);
		
		s111.add("ramanna");
		s111.add("ramanuja");
		s111.add("rameshwara");
		s111.add("eshwrara");
		s111.add("someshwara");
		System.out.println("the updated contant now "+s111);
		
		for(String c:s111)
		{
			//System.out.println("before contains rama "+c);
			//System.out.println("");
			if(c.contains("rama"))
			{
				System.out.println("after contain rama "+c);
			}
		}
		
		
		
	}

	@Override
	public String toString() {
		return "col21 []";
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

}
