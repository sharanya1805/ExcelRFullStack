class M
{
	public static void main(String[] args) 
	{
		int i=0;
		while(i<5)
		{
			System.out.println("begin" +i);
			int j=0;
			while(j<5)
			{
				j++;
				System.out.println("begin" +i+ "," +j);
				if (j>1)
				{
					//continue;
					break;
				}
				System.out.println("end" +i+ "," +j);
			}
			System.out.println("end" +i);
			i++;
		}
	}
}