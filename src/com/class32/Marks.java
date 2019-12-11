package com.class32;

abstract class Marks {
	abstract double getPercentage();
	}
	class StudentA extends Marks{
		double math ;
		double biology ;
		double georgaphy;
		StudentA(double math, double biology, double georgaphy){
			this.math=math;
			this.biology=biology;
			this.georgaphy=georgaphy;
		}
		@Override
		double getPercentage() {
			double average =math+biology+georgaphy/3;
			return average;
		}
	}
	class StudentB extends Marks{
		double math ;
		double biology ;
		double georgaphy;
		double science ;
		StudentB(double math, double biology, double georgaphy,double science){
			this.math=math;
			this.biology=biology;
			this.georgaphy=georgaphy;
			this.science=science;
		}
		@Override
		double getPercentage() {
			double average =math+biology+georgaphy+science/4;
			return average;
		}
	}
