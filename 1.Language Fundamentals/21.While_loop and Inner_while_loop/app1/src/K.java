class K
{
	public static void main(String[] args) 
	{
		int i=0;
		while(i<4)
		{
		System.out.println("begin" +i);
         if(i>2)
			{
			 continue;
			 //break;
			}
			System.out.println("end" +i);
			i++;
		}
		
	}
}