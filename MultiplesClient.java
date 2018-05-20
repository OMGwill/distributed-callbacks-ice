public class MultiplesClient extends Ice.Callback
{
	private int factor;
	Multiples.MultipleServerPrx server;

	public MultiplesClient(int f, Multiples.MultipleServerPrx s)
	{
		factor = f;
		server = s;
	}

	public void callServer()
	{
	      System.out.println("Calling the server with factor " + factor);
			server.begin_getRandomMultiple(factor, this);
            System.out.println("Done calling the server.");
			
            for (int i=0; i<20; i++)
            {
                 RandomSleep.SleepAWhile(500);
                 System.out.println("Client is working...");
            }
	}

	public void completed(Ice.AsyncResult r)
	{
		try {
			int result = server.end_getRandomMultiple(r);
			System.out.println("For factor " + factor + " result is " + result);
		} catch (Ice.LocalException ex) {
			System.err.println("Exception is: " + ex);
		}
	}
}