//prime number by if else, for, break//
class prime
{
  public static void main(String args[])
  {
int num;
boolean isprime = true;
num =Integer.parseInt(args[0]);
for( int i=2;i<num/2;i++)
{
if((num % i)==0)
{
isprime = false;
break;
}
}
if(isprime)
{
	System.out.println("prime number :  " +num);
}
else
	System.out.println("not a prime number :  " +num);
}
}	