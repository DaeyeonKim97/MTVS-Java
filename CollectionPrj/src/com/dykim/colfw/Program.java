package com.dykim.colfw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		int size = list.size();
		System.out.printf("size : %d\n",size);

		int num = list.get(2);
		System.out.printf("num : %d\n",num);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n",size);
		
		
		Set<Integer> set = new HashSet<>();
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		num = set.size();
		System.out.printf("num : %d\n",num);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("id", 3);
		
		System.out.println(map.get("id"));
		
	}

}
