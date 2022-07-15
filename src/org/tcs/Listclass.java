package org.tcs;


import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.ArrayList;

public class Listclass{
	
	public static void main(String[] args) {
		
	List<Integer>l = new ArrayList();
	
	l.add(15);
	l.add(25);
	l.add(35);
	l.add(45);
	l.add(55);
	l.add(65);
	l.add(75);
	l.add(85);
	l.add(95);
	l.add(105);
	l.add(115);
	l.add(125);
	l.add(135);
	l.add(145);
	l.add(155);
	
		System.out.println(l);
		
		System.out.println("===========================================");
		
	//List Length
		
		int size = l.size();
		System.out.println(size);
		
		System.out.println("===========================================");
		
	//get the last index value in list	
		
	    int lindex=	l.lastIndexOf(155);
	    System.out.println(lindex);
		
		System.out.println("===========================================");
		
		
	//get 1st 5valus in list
		
		for (int i = 0; i < l.size()-10; i++) {
			
			Integer value = l.get(i);
			System.out.println(value);
		}
		
		System.out.println("===========================================");
		
		
	//get last 5 values in list
		
		for (int i = 10; i < l.size(); i++) {
			
			Integer lastvl = l.get(i);
			System.out.println(lastvl);
		}
		
		System.out.println("===========================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
