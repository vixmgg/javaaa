/*
 *  Koszalin 2004
 *  smtpClient.java
 *  Dariusz Rataj (C)
 */


import java.io.*;
import java.net.*;

public class smtpClient {

  // obiekt gniazda i strumienie I/O
  Socket socket = null;              // gniazdo
  PrintWriter out = null;         // input
  BufferedReader in = null; // output


  // wysylanie komunikatow przez strumien out
  public void sendText(String text)
    {
      out.println(text);
      System.out.println(" K: " + text);
    }

  // odbieranie komunikatow przez strumien in
  public String recvText() throws IOException
    {
      String odp = in.readLine();
      System.out.println(" S: " + odp);
      return odp;
    }

  // konstruktor: argumenty <><><>
  public smtpClient(String host, 
                    String strFrom, 
                    String strTo, 
                    String subject, 
                    String message) throws IOException {

   // próba nawi¹zania po³¹czenia z serwerem SMTP
      try {
        socket = new Socket(host, 25);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(
                      new InputStreamReader(socket.getInputStream()));
      } catch (UnknownHostException e) {
          System.err.println("Nieznany host: "+host);
          System.exit(1);
      } catch (IOException e) {
          System.err.println("Problem z polaczeniem z "+host);
          System.exit(1);
      }
      recvText();
      sendText("HELO smtpClient");//"powitanie"
      recvText();
      sendText("MAIL FROM: "+strFrom+"");//wys³anie nadawcy
      recvText();
      sendText("RCPT TO: "+strTo+"");//wys³anie odbiorcy
      recvText();
      sendText("DATA");              //przesy³anie danych (tresci listu)
      recvText();
      sendText("Subject: "+subject); //wys³anie tematu
//    sendText("Cc: \"Telewizja Polska\"<biuro@tvp.pl>"); //przes³anie na inny adres
//    sendText("Reply-to: "+strTo+"\n"); // adres zwrotny wiadomoœci
      sendText(message);   // a potem wiadomoœci
      sendText(".");       // linia "." - informacja dla serwera o zakonczeniu tresci
      recvText();
      sendText("QUIT");    // zakoñczenie
      recvText();
      socket.close();      // zamkniêcie po³¹czenia
  } 
  
public static void main(String[] args) throws IOException {
  
   String host    = "moskit.ie.tu.koszalin.pl";
   String strFrom = "\"Ktos\"<jolka@moskit.ie.tu.koszalin.pl>";
   String strTo   = "\"Jozek \"<jozek@kos.man.koszalin.pl>"; 
   String subject = "Proba maila 1";
   String message = "To jest próba wiadomosci z moskita \n" +
                    "na kosa. Tresc tej wiadomosci nie ma\n" +
                    "wiêkszego znaczenia ale dobrze ¿e jakaœ jest";
  
   new smtpClient(host, strFrom, strTo, subject, message);
  }
}
