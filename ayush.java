public class ayush 
{
	public static void main(String args[])
	{
		double a[][]=new double[100][100];
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				a[i][j]=Math.floor(Math.random()*1.5);
			}
		}
		System.out.println("The Random input matrix is generated..!!!");
		for(int i=0;i<100;i++)
		{
			int count=0;
			for(int j=0;j<100;j++)
			{
				if(a[j][i]==1)
				{
					count+=1;
				}
			}
			if(count==0)
			{
				for(int j=0;j<100;j++)
				{
					a[j][i]=0.01;
				}
			}
			else
			{
				for(int j=0;j<100;j++)
				{
					a[j][i]=a[j][i]/count;
				}
			}
		}
		System.out.println("The Matrix P is generated..!!!");
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				a[i][j]=0.85*a[i][j]+0.15*0.01;
			}
		}
		System.out.println("The Matrix Q is generated..!!!");
		double v[]=new double[100];
		double sum=0;
		for(int i=0;i<100;i++)
		{
			v[i]=Math.random();
			sum+=v[i];
		}
		for(int i=0;i<100;i++)
		{
			v[i]=v[i]/sum;
		}
		double res[]=new double[100];
		for(int i=0;i<100;i++)
		{
			res[i]=0;
		}
		
		for(;!what(res,v);)
		{
			for(int i=0;i<100;i++)
			{
				double dum=0;
				for(int j=0;j<100;j++)
				{
					dum+=a[i][j]*v[j];
				}
				res[i]=dum;
			}
			for(int i=0;i<100;i++)
			{
				v[i]=res[i];
			}
		}
		System.out.println("The Ranking Matrix is");
		for(int i=0;i<100;i++)
		{
			System.out.print(v[i]+"  ");
		}
	}
	public static boolean what(double res[],double v[])
	{
		for(int i=0;i<100;i++)
		{
			if((res[i]-v[i])>0.01)
			{
				return false;
			}
		}
		return true;
	}
	

}
