import java.util.Scanner;
class primeNo
{ public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int a ;
System.out.println("enter a no.");
a = sc.nextInt();
if(a==2){
System.out.println("prime no.");}
else
{
for( int i=2; i<a/2; i++)
{
if(a%i==0)
{System.out.println("not a prime no.");
break;}
else
System.out.println("a prime no.");
}
}
}
}