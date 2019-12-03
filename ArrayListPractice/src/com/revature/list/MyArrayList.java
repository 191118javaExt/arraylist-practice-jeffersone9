package com.revature.list;

public class MyArrayList {
	private final int INITIAL_CAPACITY = 100;
	private int[] array = new int[INITIAL_CAPACITY];
	private int capacity = INITIAL_CAPACITY;
	private int size = 0;
	public void add(int val) {
		// TODO Auto-generated method stub
		if(size >= capacity) {
			capacity *= 2;
			int[] temp = array.clone();
			array = new int[capacity];
			for(int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[size] = val;
		size++;
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		if(index > size - 1) {
			System.out.println("Out of bounds");
		}
		else {
			
			array[index] = val;
		}
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		size--;
		for(int i = index; i < size -1 ; i++) {
			array[i] = array[i + 1];
		}
		array[size] = 0;
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder response = new StringBuilder("[");
		for(int i = 0; i < size; i++) {
			response.append(array[i]);
			if(i < size - 1) {
				response.append(", ");
			}
		}
		response.append("]");
		return response.toString();
	}
}
