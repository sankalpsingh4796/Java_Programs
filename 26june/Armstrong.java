import java.util.Scanner;
class Amstrong
{ public static void main(String [] args)
{
int n, temp,a,c=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter a three digit no.");
n = sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
c+=(a*a*a);
n=n/10;
}
if(c==temp)
System.out.print("is a amstrong no.");
else
	System.out.print("not a amstrong no.");
}
}