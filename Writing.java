class Writing extends Thread
{
	public void bookWriting()
	{
	 	for(int i=0; i<=10;i++)
			System.out.println("book writing processing");
		try{
			Thread.sleep(5000);
		 }
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		bookWriting();
	}
}