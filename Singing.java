class Singing extends Thread
{
	public void SongSinging()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Song Singing Processing");
	}
	public void run()
	{
		SongSinging();
	}
}