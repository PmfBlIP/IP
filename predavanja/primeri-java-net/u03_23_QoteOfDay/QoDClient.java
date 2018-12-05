package u03_23_QoteOfDay;
import java.net.*;
import java.io.*;

public class QoDClient
{
	public static void main(String[] args)
	{
		try
		{
			int port = 6017;
			/* make connection to server socket */
			Socket sock = new Socket("127.0.0.1", port);
			InputStream in = sock.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(in));
			/* read the QoD from the socket */
			String line;
			while ((line = bin.readLine()) != null)
				System.out.println(line);
			/* close the socket connection */
			sock.close();
		}
		catch (IOException ioe)
		{
			System.err.println(ioe);
		}
	}
}