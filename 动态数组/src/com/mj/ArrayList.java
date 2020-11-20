package com.mj;

public class ArrayList<E> extends AbstractList<E> {
	private int size;
	private E[]elements;
	
	private static final int DEFAULT_CAPACITY=10;
	//private static final int DEFAULT_NOTFOUNT=-1;
	//构造函数 初始化数组容量CAPACITY
	public ArrayList(int capacity) {
		capacity=(capacity<DEFAULT_CAPACITY)?DEFAULT_CAPACITY:capacity;
		elements=(E[])new  Object[capacity];
	}
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
//	private void rangeChange(int index) {
//		if(index<0||index>=size) {
//			boundOfException();
//		}
//	}
//	private void rangeChangeForAdd(int index) {
//		if(index<0||index>size) {
//			boundOfException();
//		}
//	}
//	private void boundOfException() {
//		throw new IndexOutOfBoundsException("错误的下标索引");
//	}
//	
	//清空
	/**
	 * 当加入泛型后 ，数组类型会不同
	 * clear 清楚 过剩内存
	 */
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i]=null;
		}
		size=0;
	}
//	//返回元素数量
//	public  int size () {
//		return size;
//	}
//	public boolean isEmpty() {
//		return size==0;
//	}
//
//	public boolean contains(E element) {
//	//不等于负一则为包含
//		return	indexOf(element)!=ELEMENT_NOT_FOUND;
//	}
//	
//	public void  add (E element) {
//		add(size,element);
//	}
	/*
	  * 希望加入的流量
	 */
	public  void  add (int index,E element) {
		//if(element==null || "".equals(element)) return;
		//在index位置添加元素
		//注意可以往最后一个位置添加元素
		rangeCheckForAdd(index);
		ensureCapacity(size+1);
		for(int i=size;i>index;i--) {
			elements[i]=elements[i-1];
		}
		elements[index]=element;
		size++;
	}
	
	/**
	 * @param capacity
	 * 确保当前容量为想要的容量
	 * 如不满足 new新数组 进行迁移
	 */
	private void ensureCapacity(int capacity) {
		int OldCapacity=elements.length;
		if(OldCapacity>=capacity) return;
		int newCapacity=OldCapacity+(OldCapacity>>1);
		E []newElements=(E[])new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i]=elements[i];
		}
		elements=newElements;
		System.out.println(OldCapacity+"扩容为"+newCapacity);
	}

	public E get(int index) {
		rangeCheck(index);
		return elements[index];
	}
	
	public E set(int index , E element) {
		rangeCheck(index);
		E old=elements[index];
		elements[index]=element;
		return old;
	}
	
	//移除某个元素
	public E remove(int index) {
		rangeCheck(index);
		E old =elements[index];
		for(int i=index+1;i<size;i++) {
			elements[i-1]=elements[i];
		}
		elements[--size]=null;
		return old;
	}
	public  void remove (E element) {
		remove(indexOf(element));
	}
	//返回元素下标
	/**
	 * @param element
	 * @return
	 * equals方法的应用 
	 */
	public  int  indexOf(E  element) {
		if(element==null) {
			for (int i = 0; i <size; i++) {
				if(elements[i]==element) {
					return i;
				}
			}
		}else {
			for (int i = 0; i <size; i++) {
				if(element.equals(elements[i])) {
					return i;
				}
			}
		}
		//遍历元素
		
		return  ELEMENT_NOT_FOUND ;
	}

	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append("size=").append(size).append(",[");
		for(int i=0;i<size;i++) {
			if(i!=0) {
				s.append(',');
			}
			s.append(elements[i]);
		}
		s.append("]");
		return s.toString();
	}
	
	
	
	
	
}
