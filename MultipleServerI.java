
public class MultipleServerI extends Multiples._MultipleServerDisp
{
    public int
    getRandomMultiple(int factor, Ice.Current current)
    {
        System.out.println("server got factor " + factor);
        int result = 1;
        while ((result % factor) != 0)
        {
        	RandomSleep.SleepAWhile(500);
        	result = (int)(Math.random() * 500) + 1;
        	System.out.println("For factor " + factor + " server generated " + result);
        }
        return result;
    }
}
