import java.util.*; 
import cie.student;
import cie.internal;
import see.external;

class packstuddemo
{
	public static void main(String args[])
	{
		student s1 = new student();
		s1.getdetails();
		s1.putdetails();
	
		internal i = new internal();
		i.getcie();
		i.dispcie();

		external e = new external();
		e.getsee();
		System.out.println("The Final SEE  Marks is : ");
		e.dispsee();
	}
}

