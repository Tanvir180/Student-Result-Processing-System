/** **************************************************************
 * tcpServer.java
 *
 * usage : java tcpServer .
 * default port is 5050.
 * connection to be closed by client.
 * this server handles only 1 connection.
 * this server responds to the action FIND to search an array for a name
 *
 * Copyright (c) 2002-2006 Advanced Applications Total Applications Works.
 * (AATAW)  All Rights Reserved.
 *
 * AATAW grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to AATAW.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. AATAW AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL AATAW OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes or for commercial purposes.
 *
 * Changelog:
 *****************************************************************/

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/** *****************************************************************
 * The tcpServer class defines the framework for creating a server
 * based application. The server responds to request from a Client.
 *
 ***************************************************************** */
public class tcpServer extends JFrame implements  ActionListener {
    private int port = 5050 ;
    private boolean foundRec = false ;
    private String messageTokens[]  = new String[ 16 ] ,
             addrRecord[][]  = {
                  {"James", "Wilie", "123 Main St.", "919-555-3442"},
                  {"Julie", "Smith", "123 Oak St.", "919-555-3782"},
                  {"Mary", "Easley", "123 Walnut St.", "919-555-5552"},
                  {"Cato", "Willingham", "123 Jones St.", "919-555-3492"},
                  {"Mike", "Jordan", "123 Saunders St.", "919-555-3882"},
                  {"Carole", "Fusemi", "123 Oak Lane", "919-555-3472"},
                  {"Peter", "Wie", "123 Oak Way", "919-555-3642"},
                  {"Donald", "Hill", "123 Oak Blvd.", "919-555-3452"},
                  {"Regina", "Bell", "123 Walnut Lane", "919-555-3342"},
                  {"Alicia", "Keyes", "123 Walnut Way", "919-555-3332"},
                  {"Charles", "Lawrence", "123 Whatis St.", "919-555-3222"},
                  {"Robert", "Urengo", "123 Academy St.", "919-555-3112"},
                  {" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "},
                  {" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}
             } ;
    private ServerSocket server_socket;
    private BufferedReader input;
    private PrintWriter output;
    private Container c ;
    private JTextArea display ;
    private JButton cancel , send, exit;
    private JPanel buttonPanel ;
    private StringTokenizer tokens ;

    /** *********************************************************
     * This is the tcpServer constructor which is used to
     * initialize the tcpServer() object.
     ************************************************************/
    public  tcpServer() {
       super ( "Server" ) ;

       setup() ;

       RunServer() ;
    }

    /** *********************************************************
     * The setUp() method does the intializes the application's
     * 1- JButtons
     * 2- JPanel
     * 3- JTextArea
     * 4- Set the size
     * 5- Set the location of the application on the screen
     * 6- Make the application visiable
     ************************************************************/
    public  void setup() {
      c = getContentPane();


      exit = new JButton( "Exit" );
      exit.setBackground( Color.red ) ;
      exit.setForeground( Color.white ) ;
      buttonPanel = new JPanel() ;
      buttonPanel.add( exit ) ;
      c.add( buttonPanel , BorderLayout.SOUTH) ;


      exit.addActionListener( this );

      display = new JTextArea();
      display.setEditable( false );
      addWindowListener( new WindowHandler( this ) );
      c.add( new JScrollPane( display ),
             BorderLayout.CENTER );

      setSize( 400, 400 );
      setLocation( 10, 20 ) ;
      show();
    }


   /** *********************************************************
    * The RunServer() method in the server reads and writes data to
    * the client. This method
    * 1- Sets up a ServerSocket
    * 2- Sets up means to read from the socket
    * 3- Sets up means to write to the socket
    * 4- Sets up a filter to respond to specific request from the
    *    Client
    ************************************************************/
    public void RunServer() {
       try {

          server_socket = new ServerSocket( 5050, 100,
                                  InetAddress.getByName("127.0.0.1"));
          display.setText("Server waiting for client on port " +
			       server_socket.getLocalPort() + "\n");

          // server infinite loop
          while( true ) {
             Socket socket = server_socket.accept();
             display.append("New connection accepted " +
				   socket.getInetAddress() +
				   ":" + socket.getPort() + "\n");
             input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             output = new PrintWriter(socket.getOutputStream(),true);

             String message = "" ;

             // print received data
             try {
                while( !message.toUpperCase().equals( "QUIT" )) {
                   message = (String)input.readLine();
                   tokens = new StringTokenizer( message ) ;

                   if ( tokens.countTokens() >= 1 )   {
                      int ii = 0 ;
                      while( tokens.hasMoreTokens() )  {
                         messageTokens[ ii ] = tokens.nextToken().toString() ;
                         display.append("\n" + messageTokens[ ii ] ) ;
                         ii++ ;
                      }

                      if ( messageTokens[ 0 ].toUpperCase().equals( "FIND" ) ) {
                         findName() ;
                      }
                      else if ( messageTokens[ 0 ].toUpperCase().equals( "LISTALL" ) ) {
                         listNames() ;
                      }
                      else if ( messageTokens[ 0 ].toUpperCase().equals( "ADD" ) ) {
                         addName() ;
                      }
                      else if ( messageTokens[ 0 ].toUpperCase().equals( "UPDATE" ) ) {
                         updateName() ;
                      }
                      else if ( messageTokens[ 0 ].toUpperCase().equals( "DELETE" ) ) {
                         deleteName() ;
                      }
                      ii = 0 ;
                   }
                   else  {
                      display.append( message );
                      message = null; //so the loop will terminate the server
                      break;
                   }
                }
             }
             catch (IOException e) {
                display.append("\n" + e);
             }

             // connection closed by client
             try {
                socket.close();
                display.append("\n Connection closed by client");
             }
             catch (IOException e) {
                display.append("\n" + e);
             }
          }
       }
       catch (IOException e) {
          display.append("\n" + e);
       }
    }

   /** *********************************************************
    * This method responds to the exit button being pressed
    * on the tcpServer frame.
    *************************************************************/
   public void actionPerformed( ActionEvent e )    {
      if ( e.getSource() == exit )
         closeConnection() ;
   }

   /** *********************************************************
    * This method closes the socket connect to the server.
    ************************************************************ */
   public  void closeConnection() {
      try {
         server_socket.close();
         input.close();
         System.exit( 0 );
      }
      catch (IOException e) {
         display.append("\n" + e);
         System.exit( 0 ) ;
      }
   }
   /** ************************************************
    * The addName() is just a stub in this version.
    *************************************************** */
   public void addName() {

   }

   /** *********************************************************
    * This method searches for the a name matching the
    * name sent by the client. The name to serach for is in 
    * messageTokens[ 1 ]; therefore, each record's second 
    * field in the addrRecord array is compared to the entity in 
    * messageTokens[ 1 ]. If a match is found, an indication of 
    * a found record is returned; otherwise, an indication of
    * a not-found record is returned.
    *********************************************************** */
   public void findName() {
       int ii = 0 , recLength = addrRecord.length ;

       foundRec =  false ;

floop: while ( ii < recLength ) {
          if ( addrRecord[ ii ][ 1 ].toUpperCase().equals( messageTokens[ 1 ].toUpperCase() ) ) {
             display.append("\n" + "RecordFound" ) ;
             sendData( "RECORDFOUND; " + addrRecord[ ii ][ 0 ] + "; " +
                   addrRecord[ ii ][ 1 ] + "; " +
                   addrRecord[ ii ][ 2 ] + "; " +
                   addrRecord[ ii ][ 3 ] + ";;"  ) ;
             foundRec =  true ;
             break floop;
          }

          ii++ ;
       }

       if ( !foundRec ) {
          sendData( "NOTFOUND; " + messageTokens[ 1 ] ) ;
          display.append("\n" + "NOTFOUND; " + messageTokens[ 1 ] ) ;
       }
   }

   /** *********************************************************
    * This method lists the names in the array and sends them to
    * the client.
    *********************************************************** */
   public void listNames() {
       int ii = 0 , recLength = addrRecord.length ;

       foundRec =  false ;

floop: while ( ii < recLength ) {
          if ( !addrRecord[ ii ][ 1 ].equals( " " ) ) {
             sendData( "LISTRECORD; " + addrRecord[ ii ][ 1 ] + "; "   ) ;
             display.append("\nLISTRECORD; "  + addrRecord[ ii ][ 1 ] + "; ") ;
          }
          else
             break floop;

          ii++ ;
       }
   }

   /** ***********************************************************
    * The updateName() method is just a stub in this version.
    ***********************************************************  */

   public void updateName() {

   }

   /** *******************************************************
    * This method deletes the name matching the name sent by
    * the client. The record to be deleted is passed to the 
    * Server and is contained in messageTokens[ 1 ]. The 
    * addrRecord array is searched for a match to the field
    * in messageTokens[ 1 ]. If a match is found, that record
    * is deleted.
    ********************************************************* */
   public void deleteName() {
       int ii = 0 , recLength = addrRecord.length ;

       foundRec =  false ;

floop: while ( ii < recLength ) {
          if ( addrRecord[ ii ][ 1 ].toUpperCase().equals( messageTokens[ 1 ].toUpperCase() ) ) {
             /** The record was  found */
             display.append("\n" + "RecordFound" ) ;
             sendData( "RECORDDELETED; " + addrRecord[ ii ][ 0 ] + "; " +
                   addrRecord[ ii ][ 1 ] + "; " +
                   addrRecord[ ii ][ 2 ] + "; " +
                   addrRecord[ ii ][ 3 ] + ";;"  ) ;
             foundRec =  true ;

             addrRecord[ ii ][ 0 ] = "" ;
             addrRecord[ ii ][ 1 ] = "" ;
             addrRecord[ ii ][ 2 ] = "" ;
             addrRecord[ ii ][ 3 ] = "" ;

             break floop;
          }

          ii++ ;
       }

       /** The record was not found */
       if ( !foundRec ) {
          sendData( "NOTFOUND; " + messageTokens[ 1 ] ) ;
          display.append("\n" + "NOTFOUND; " + messageTokens[ 1 ] ) ;
       }
   }

  /** ********************************************************
    * Send the found record back to the client
    ******************************************************** */
   public  void sendData(String str) {
      output.println( str );
      output.flush() ;
   }

   /** ********************************************************
    * This method is the main entry point called by the JVM.
    ********************************************************  */
    public static void main(String args[]) {
       final tcpServer server = new tcpServer() ;
       server.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               server.closeConnection() ;
               System.exit( 0 );
            }
         }
      );
    }


   /** ********************************************************
    * This method closes the socket connect to the server when the
    * application window is closed.
    ********************************************************  */
   public class WindowHandler extends WindowAdapter {
      tcpServer tcpS;

      public WindowHandler( tcpServer t ) { tcpS = t; }

      public void windowClosing( WindowEvent e ) { tcpS.closeConnection(); }
   }

}