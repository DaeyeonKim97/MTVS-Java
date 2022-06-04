package com.dykim.variablelength;


public class GList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	
	public GList() {
		capacity = 3;
		amount = 3;
		nums = new Object[capacity];
		current = 0;
	}
	
	public void add(T num) {
		//increase capacity
		if(current >= capacity) {
			capacity += amount;
			Object[] temp = nums;
			nums = new Object[capacity];
			System.arraycopy(temp, 0, nums, 0, current);
			System.out.println("용량 증가 / 현재 용량: "+capacity);
		}
		
		nums[current] = num;
		current++;
	}

	public void clear() {
		current = 0;
	}

	public int size() {
		return current;
	}

	public T get(int index) {
		if(current <= index) {
			throw new IndexOutOfBoundsException();
		}
		
		return (T)nums[index];
	}

}
