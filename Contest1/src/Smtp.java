import java.net.*;
	import java.io.*;


	class Smtp2
	{


	public static void main(String[] arg)
	{
	Socket socket;
	String ans;
	BufferedReader	br ;
	BufferedWriter bw ;
	PrintStream p1;
	char c=13,d=10;



	try
	{

	System.out.println(InetAddress.getLocalHost());
	socket=new Socket("bahria.edu.pk",25);
	System.out.println();
	System.out.println();
	br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
	bw = new BufferedWriter (new OutputStreamWriter (socket.getOutputStream()));




	ans=br.readLine();
	System.out.println("Server Response: " +ans);

	bw.write("helo ahmz"+c+d);
	bw.flush();
		ans=br.readLine();
	System.out.println("Server Response : " +ans);


	bw.write("Mail From: hmhridoy65@gmail.com"+c+d);
	bw.flush();
	ans=br.readLine();
	System.out.println("Server Response : " +ans);


	bw.write("RCPT To: nida"+c+d);
	bw.flush();
	ans=br.readLine();
	System.out.println("Server Response : " +ans);




	bw.write("Data"+c+d);
	bw.flush();
	ans=br.readLine();
	System.out.println("Server Response : " +ans);

	bw.write("HI frnd, how r u");
	bw.write(".");
	bw.flush();

	/*ans=br.readLine();
	System.out.println("Server Response : " +ans);*/
	socket.close();
	System.out.println("Closed Connection with Server");
	}

	catch(IOException e)
	{System.out.println("Error in Connecting to Port");}


	}
	}

