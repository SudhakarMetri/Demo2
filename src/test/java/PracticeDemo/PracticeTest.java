package PracticeDemo;

public class PracticeTest {
public static void main(String[] args)
{
	String s="1234Bharat1234";
	String dig="";
	int sum=0;
	for(int i=0;i<s.length();i++){
		if(Character.isDigit(s.charAt(i)))
		{dig=dig+s.charAt(i);
		}
	}
	int no=Integer.parseInt(dig);
	while(no!=0)
		
	{int rem=no%10000;
	sum=sum+rem;
	no=no/10000;
		
	}
System.out.println(sum);
}
}
