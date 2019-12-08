package com.class29;

public abstract class File {
public void edit() {
	System.out.println("File can be edited");
	
}
public void close() {
	System.out.println("File can be closed");
	
}
public abstract void open() ;
}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("File will open with notepad++");
		}}
	class WordFile extends File{

		@Override
		public void open() {
	System.out.println("File will open with sublime text");
			
		}}
		class PDFFile extends File {

			@Override
			public void open() {
				System.out.println("File will open with Adobe");
				
			}
			
	
		}
	
