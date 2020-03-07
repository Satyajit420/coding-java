package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPractise {

	public static void main(String[] args) {
		// String Reversal
		String s=new String("satya");
		
		
	    char[] ch=s.toCharArray();
		
		
		System.out.println();
		
		for(int j=((ch.length)-1);j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		
		System.out.println();
	//Array Reversal
		char[] f= {'s','a','t','y','a'};
		
		for(int p=((f.length)-1);p>=0;p--)
		{
		 System.out.print(f[p]);
		}
		System.out.println();
		List<char[]> l=Arrays.asList(ch);
		System.out.println();
		System.out.println(l.get(0));
		
		List<Character> x= new ArrayList();
		
			for(int d=0;d<ch.length;d++)
			{
				x.add(ch[d]);
			}
				
		
		System.out.println(x);
		x.addAll(x);
		System.out.println(x);
		String [] z= {"A","B"};
		List<String> g=Arrays.asList(z);
		System.out.println();
		System.out.println(g);
		
		ArrayList j=new ArrayList();
		
	     j.add('a');
	     j.add('b');
	     System.out.println(j);
	     
	     ArrayList k=new ArrayList();
	     k.add('c');
	     k.add('d');
	     System.out.println(k);
	     
	     j.addAll(0, k);
	     System.out.println(j);
	     
	     Object[] d=j.toArray();
	     
	     for(Object u:d)
	     {
	    	System.out.print(u); 
	     
	     }
	     System.out.println();
	     System.out.println(j);
	     
		
	
		
		
		}
	
	
	
	
	
	
	
				
		
		
		
		

	}


