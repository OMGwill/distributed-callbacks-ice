import javax.swing.JOptionPane;


public class Client {
	
    public static void
    main(String[] args)
    {
        int status = 0;
        Ice.Communicator ic = null;
        try
        {
            ic = Ice.Util.initialize(args);
            Ice.ObjectPrx base = ic.stringToProxy("MultServer:default -h localhost -p 10000");
            Multiples.MultipleServerPrx server = Multiples.MultipleServerPrxHelper.checkedCast(base);
            if(server == null)
            {
                throw new Error("Invalid proxy");
            }
            String s = JOptionPane.showInputDialog("Please enter your multiple:");
            int factor = Integer.parseInt(s);

			MultiplesClient f = new MultiplesClient(factor, server);
			f.callServer();

            JOptionPane.showMessageDialog(null, "Close the client?");

        }
        catch(Ice.LocalException e)
        {
            e.printStackTrace();
            status = 1;
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            status = 1;
        }
        if(ic != null)
        {
            try
            {
                ic.destroy();
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
                status = 1;
            }
        }
        System.exit(status);
    }
}
