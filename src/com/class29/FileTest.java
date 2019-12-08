package com.class29;

public class FileTest {
public static void main(String[] args) {
	File file1=new JavaFile();
	File file2=new WordFile();
	File file3=new PDFFile();
	file1.open();
	file1.edit();
	file1.close();
	file2.open();
	file2.edit();
	file2.close();
	file3.open();
	file3.edit();
	file3.close();
}
}
