import java.util.Scanner;
class PrimeNo
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("enter a no.");
int a= sc.nextInt();
for( int i=2; i<a/2; i++)
{
if(a%i==0)
{System.out.print("not a prime no.");
break;}
else
System.out.print("a prime no.");
}
if(a==2||a==3)
System.out.print("a prime no.");


}
}