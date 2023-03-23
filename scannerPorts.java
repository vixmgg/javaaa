/*
 *  Koszalin 2004
 *  scannerPorts.java
 *  Przyklad skanera portow
 *  Dariusz Rataj (C)
 */
 
import java.net.*;
import java.io.*;

public class scannerPorts {

  public static void main(String[] args) {
    
    Socket socket;
    String host = "192.168.56.1";

    if (args.length > 0) host = args[0];
    
    System.out.println("Skanuje porty hosta: " + host);
    for (int i = 1; i < 1024; i++) {
      try {
        socket = new Socket(host, i);
        System.out.println("na porcie " + i + " dziala serwer");
        socket.close();
      }
      catch (UnknownHostException e) {
        System.err.println(e);
        break;
      }
      catch (IOException e) {
        // brak serwera na tym porcie - nic sie nie dzieje
      }
    } // koniec for
  
  }  // koniec main
}  // koniec skanerPorts
