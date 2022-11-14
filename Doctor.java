import java.util.Scanner;

public class Doctor extends Person 
{

	//private String d_name;
	private String department;
	private int id;
	
	Doctor()
	{
		//d_name=null;
		department=null;
		id=0;
		
	}
	Doctor(/*String d_name,*/String name,int age,String address, String department,int id )
	{
		
		super(name,age,address);
		this.department=department;
		this.id=id;
	}
	Doctor(Doctor D)
	{
		super(D);
		department=D.department;
		id=D.id;
	}
	//int n=5;
	void readDoctor()
	{
		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter how many data there:");
//		int n=sc.nextInt();
		
//		for(int i=0;i<n;i++)
//		{
			this.readPerson();
		System.out.println("Enter Doctor's Department:");
		department=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter id Number:");
		id=sc.nextInt();
		//}
	}
	void showDoctor()
	{
		
//		for(int i=0;i<n;i++)
//		{
		this.showPerson();
		System.out.println("Doctor's Department is: "+department);
		System.out.println("Id number is: "+id);
		//}
	}
}
