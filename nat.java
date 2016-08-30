import java.io.*;
import java.util.Scanner;
public class nat
{
public Static void main(String args[])
{
int n,i=1;
int sum=0;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("sum of "+n+" number is:"+sum);
}
}

