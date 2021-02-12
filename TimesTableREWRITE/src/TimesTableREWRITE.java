import java.io.*;
import java.util.*;
public class TimesTableREWRITE 
{
	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings({ "unused", "resource" })
		Scanner in = new Scanner(System.in);
		boolean Run = true;
		System.out.println("\t\t\t\t\tWelcome to the Times Table Program!!!\n\n");
		while (Run)
		{
		int Upperlimit = UpperLimit();
		int deep = HowDeep();
		TimesTable(Upperlimit,deep);
		System.out.println("Do you wanna run it again? 1=Yes and 2=No");
		int userinput = in.nextInt();
		if (userinput==1)
		{
			Run = true;
		}
		else if (userinput!=1)
		{
			Run = false;
		}
	}
		System.out.println("\nThat's all");
}
	public static int UpperLimit() throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What number would you like for the upper limit?");
		int upperlimit = in.nextInt();
		return upperlimit;
	}
	public static int HowDeep() throws IOException
{
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Input a number for how deep you would like the table to be");
	int deep = in.nextInt();
	return deep;
}
	public static void TimesTable(int upperlim, int Howdeep)
	{
		for (int firstnumberinrow = 1; firstnumberinrow <=upperlim; firstnumberinrow ++ )
		{
			System.out.printf("%4d" , firstnumberinrow);
			for (int doubledRowNumbers = 2; doubledRowNumbers<=Howdeep; doubledRowNumbers++ )
		{
			System.out.printf("%4d" , firstnumberinrow  * doubledRowNumbers);
		}
			System.out.println();
		}
	}
}
