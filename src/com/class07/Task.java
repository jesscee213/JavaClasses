package com.class07;

import java.util.Scanner;

public class Task {
	//print numbers from 1-50 except those that are divisible by 3
	
	public static void main(String[] args) {
	for(int i=1; i<50; i++) {
        if(i%3==0) {
            continue;
        }
        System.out.println(i);
}
}
}
