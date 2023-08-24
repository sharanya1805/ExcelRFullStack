class R 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println("loop begin" +i);
			if(i>5)
			{
			  break;
              //System.out.println("if block");
			}
		System.out.println("loop end" +i);
		}
		System.out.println("main end");
	}
}
//Break or continue must be the last stetments in a loop