import java.util.Scanner;
class fibbo
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);


		boolean user=true;
		do{
			System.out.println("ENTER N");
			int n=sc.nextInt();
			int sum=0;
			int a=0,b=1,p;

		if(n==0)
		{	System.out.println("YOU HAVE ENTERED A INVALID NUMBER");

		}
		else
		if(n==1)
		{	System.out.println("1");

		}
		else{

		for(int i=2;i<n;i++)
		{	sum=a+b;
			a=b;
			b=sum;}
		System.out.println("fibbonacci number is:"+sum);}
		System.out.println("DO YOU WANT TO TERMINATE 0/1");
		p=sc.nextInt();
		if ( p==0 ) {
			user=false;
		}
		else {
			user=true;
		}
	}while(user);
	}
}
