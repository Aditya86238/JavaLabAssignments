//Aditya Annamwar
import java.util.Scanner;

class SY2022bit029
{
    public static int getValidRegistrationsCount(String registrations[])
	{
		String sub="";
		
		int count=0;
		
		for(int i=0;i<registrations.length;i++)
		{
			if(registrations[i].length()!=10)
			{
				continue;
			}
			if(registrations[i].charAt(0)!='2'||registrations[i].charAt(1)!='0')
			{
				continue;
			}
			if(registrations[i].charAt(2)!='0'&&registrations[i].charAt(2)!='1'&&registrations[i].charAt(2)!='2')
			{
				continue;
			}
			if(registrations[i].charAt(2)=='2')
			{
				if(registrations[i].charAt(3)!='0'&&registrations[i].charAt(3)!='1'&&registrations[i].charAt(3)!='2'&&registrations[i].charAt(3)!='3'&&registrations[i].charAt(3)!='4')
				{
					continue;
				}
			}
			sub=registrations[i].substring(4,7);
			if(sub.contains("bcs")||sub.contains("bit")||sub.contains("bce")||sub.contains("bme"))
			{
				count++;
				continue;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=s.next();
		}
		System.out.println(getValidRegistrationsCount(str));

	}
}
