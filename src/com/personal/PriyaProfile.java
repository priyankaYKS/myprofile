package com.personal;

public class PriyaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		
		System.out.println(ProfileConstants.FIRST_NAME+"PRIYA");

		System.out.println("LAST_NAME : p");
		System.out.println("Age : 26");
		
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("my hobbies is typing program code");
		
	}
	

}
