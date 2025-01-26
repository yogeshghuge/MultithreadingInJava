class MainClass1
{
	public static void main(String args[])
	{
		Writing w=new Writing();
		Reading r=new Reading();
		Listening l=new Listening();
		Singing s=new Singing();
		w.start();
		r.start();
		l.start();
		s.start();
	}
}
		