import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{ int s=1, f=1, n;
Scanner sc= new Scanner(System.in);

System.out.print("enter a no.");
n= sc.nextInt();
for( int j=2; j<=n;j++)
{
for( int i=1 ;i<=j; i++)
{
f=f*i;
}
s=s+f;
f=1;
}
System.out.println(s);
}
}

