package day6;

public class Program8_GCD {
   static int gcd(int num1,int num2)
   {
	   int gcd=1;
	   int smaller=-1;
	   if(num1<num2)
		   smaller=num1;
	   else
		   smaller=num2;
	   for(int i=1;i<=smaller;i++)
	   {
		   if(num1%i==0 && num2%i==0)
			   gcd=i;
	   }
	   return gcd;
   }
   static int lcm(int num1,int num2)
   {
	   return (num1*num2)/gcd(num1,num2);
   }
   static void coPrime(int num1,int num2)
   {
	   if(gcd(num1,num2)==1)
		   System.out.println("CO PRIME");
	   else
		   System.out.println("NOT A CO PRIME");
   }
	public static void main(String[] args) {
		int num1=12;
		int num2=24;
		System.out.println("GCD:"+gcd(num1,num2));
		System.out.println("LCM"+lcm(num1,num2));
		coPrime(num1,num2);

	

	}

}
