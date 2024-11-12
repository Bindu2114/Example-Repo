package com.socialSite.SignUp;

public class SignUp {
	public String name(String name)
	{
		if(name=="john")
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		return name;
		
	}
	public String  surname(String surname)
	{
		if(surname=="Smith")
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		return surname;
	}
	public String  Date(String date)
	{
		if(date=="10/10/2022")
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		return date;
	}
	public String  password(String password)
	{
		if(password=="abc123456")
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		return password;
	}
	public long  Mobileno(long mobile)
	{
		if(mobile==7979797979l)
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		return mobile;
	}

}
