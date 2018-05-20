
public class RandomSleep
{
	static public void SleepAWhile(int min) 	
	{
		try 		
		{
			Thread.sleep(min + (int)(Math.random() * 500));
		}
		catch (InterruptedException e) 		
		{
			e.printStackTrace();
		}
	}
}
