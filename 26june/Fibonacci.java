class Fibonacci
{
public static void main(String[] args)
{int a=0, b=1;
System.out.print(a+" "+b);
for(int i=2; i<200; i++)
{
b=a+b;
System.out.print(" "+b);
a=b-a;
}
}
}
