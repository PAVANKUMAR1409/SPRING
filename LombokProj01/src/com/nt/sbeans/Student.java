package com.nt.sbeans;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PUBLIC)
@RequiredArgsConstructor(access=AccessLevel.PRIVATE)
@AllArgsConstructor(access=AccessLevel.PROTECTED)
public class Student 
{
	@NonNull
	private Integer sId;
	@NonNull
	private String sName;
	private String sAdd;
	
	//Student(){} get c.e
	
	/*Student(int x){
		super();
//		this(5,6);
	}
	Student(int x, int y){
		this();
	}
	Student(){
		this(5);
	}*/ //recursive (infinite loop) 
	public static void main(String[] args) {
		Student s= new Student();
		
	}
}
