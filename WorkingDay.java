import java.util.Scanner;
public class WorkingDay {
public boolean day(String days)
{
	
	if(days.equalsIgnoreCase("Sunday"))
	{
		return true;
	}
	else if(days.equalsIgnoreCase("Monday")|| days.equalsIgnoreCase("Tuesday") || days.equalsIgnoreCase("Wednesday")|| days.equalsIgnoreCase("Thursday")||days.equalsIgnoreCase("Friday") || days.equalsIgnoreCase("Saturday"))
	{
		return false;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		String work=s.nextLine();
		WorkingDay w=new WorkingDay();
		if(w.day(work))
		{
	System.out.println("today is holiday");
		}
		else
		{
			System.out.println("today is working day");
		}
	}

}
