import java.util.Scanner;

public class Hospitalcp {
	public  static float Inpatient(int days,float rate ,int hospitalservices,int hospitalCharges)
	{
	 float totalin=(days*rate)+hospitalservices+hospitalCharges;
	    
		return totalin;
	}
	public static float outpatient(int hospitalservices,int hospitalCharges)
	{
		float totalout=hospitalservices+hospitalCharges;
		return totalout;
	}
	
	
	public static void main(String[]args)
	{
		int days;
	    float rate ;
		int hospitalservices;
		int hospitalCharges;
		int Entry;
		do {
		System.out.println("<<<<CADI HOSPITAL>>>");
		System.out.println("Hey,Customer are you an Inpatient or Out patient");
		System.out.println("Enter 1.In-patient client");
		System.out.println("Enter 2.Out-patient client");
		Scanner choice=new Scanner(System.in);
		Entry=choice.nextInt();
		if(Entry==1)
		{
			System.out.println("In.patient");
			System.out.println("Enter The number of days spent in the hospital");
			days=choice.nextInt();
			System.out.println("Enter the rate");
			rate=choice.nextFloat();
			System.out.println("Enter the Hospital serives");
			hospitalservices=choice.nextInt();
			System.out.println("Enter the Hospital Charges");
			hospitalCharges=choice.nextInt();
			System.out.println("The total hospital Charges are: "+Inpatient(days,rate,hospitalservices,hospitalCharges));
		}
		else if(Entry==2)
		{
			System.out.println("Enter the Hospital serives");
			hospitalservices=choice.nextInt();
			System.out.println("Enter the Hospital Charges");
			hospitalCharges=choice.nextInt();
			System.out.println("The total charges for out patient are: "+outpatient(hospitalservices,hospitalCharges));	
		}
		else
		{
			System.out.println("Enter the right choice please!!");
		}
		}
		while(Entry>2);
	}
}
