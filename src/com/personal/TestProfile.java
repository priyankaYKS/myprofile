package com.personal;

public class TestProfile {

	
	
	public static void  printprofile(IProfile profile) {
		profile.myBasicInfo();
		profile.myHobbies();
	}
	public static void main(String[] args)
	{
   IProfile myProfile=new DharaniProfile();
   TestProfile.printprofile(myProfile);
   IProfile myProfile1=new PriyaProfile();
   TestProfile.printprofile(myProfile1);
   
   
   
   
	
	
	
	
	
	
	
	
	}
	
	
	

}
