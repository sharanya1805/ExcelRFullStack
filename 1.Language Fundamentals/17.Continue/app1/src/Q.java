class Q 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println("loop begain" +i);
			if(i>5)
			{
				continue;
			}
		System.out.println("loop end" +i);
		}
		System.out.println("main end");
	}
}
