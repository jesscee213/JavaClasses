package com.class9;

public class nestedLoop {
public static void main(String[] args) {
	for (int i=0; i<=5; i++) {
		for (int j=0; j<=5; j++) {
			System.out.println(i+" "+j);
		}
	}
System.out.println("****************");

// 24 hours , 60 minutes

for (int h=0; h<24; h++) {
	for (int m=0; m<60; m++){
		System.out.println(h+":"+m);
	}
}

for( int h=1; h<24; h++) {
    
    for (int m=1; m<=60; m++) {
        if(m<10) {
        System.out.println(h+":0"+m);
        }else {
        System.out.println(h+":"+m);
        }}}}}
//IF YOU WANT TO ADD ZERO FOR MINUTES LESS THAN 10