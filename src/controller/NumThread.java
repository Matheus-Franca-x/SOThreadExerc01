package controller;

public class NumThread extends Thread
{
	public void TID()
	{
		
		new Thread()
		{
			public void run()
			{
				int id = (int) getId();
				System.out.println("TID => " + id);
			}
			
		}.start();
	}
}
