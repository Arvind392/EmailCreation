package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String email;
	private String companySuffix="aeycompany.com";
	private String changePassword;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created :" + firstName + " " + lastName);
		this.department = setDepartment();
		System.out.println("Department is: " + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is : " + this.password);
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("your email is:"+ this.email);
	}

	private String setDepartment() {
		System.out.print(
				"Department codes\n1 for sales\n2 for Development\n3 for accounting\n0 for none\nEnter department code :");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		if (choice == 1) {
			return "sales";
		} else if (choice == 2) {
			return "Dev";
		} else if (choice == 3) {
			return "Acct";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length()); // reurn double
			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);
	}

	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	public void setAlternateEmail(String email) {
		this.alternateEmail=email;
	}
	public void changepassword(String password)
	{
		this.changePassword=password;
	}
	public int getMailCapacity()
	{
		return mailboxCapacity;
	}
	public String getAlternateMail()
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	public String showInfo()
	{
		return "Dispaly name :"+firstName+lastName+ " "+"\nemial is:"+ email+"\nemailcapacity:"+mailboxCapacity +"mb";
	}
	
}
