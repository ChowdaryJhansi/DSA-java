import java.util.*;

class Perm_function
{
public static int f(int x)
{
int rv=1;
for(int i=1;i<=x;i++)
{
rv *=i;
}
return rv;
}

public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int r=scn.nextInt();

int nfact=f(n);
int nmrfact=f(n-r);
int npr=nfact/nmrfact;
System.out.print(n+"p"+r+"="+npr);
}
}
