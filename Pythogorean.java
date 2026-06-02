import java.util.*;

class Pythogorean
{
public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=scn.nextInt();
int c=scn.nextInt();

int max=a;
if(b>=max)
{
max=b;
}
if(c>=max)
{
max=c;
}

if(max==a)
{
boolean result=((b*b+c*c)==(a*a));
System.out.println(result);
}
else if(max==b)
{
boolean result=((a*a+c*c)==(b*b));
System.out.println(result);
}
else if(max==c)
{
boolean result=((a*a+b*b)==(c*c));
System.out.println(result);
}
}
}