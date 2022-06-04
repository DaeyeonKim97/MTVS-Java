package com.dykim.variablelength;

public class Program {
	
	public static void main(String[] args) {
		
		GList<Integer> list = new GList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		int size = list.size();
		System.out.printf("size : %d\n",size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n",size);
		
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		int num = (Integer)list.get(5);
		System.out.printf("num : %d\n",num);
	}

}
