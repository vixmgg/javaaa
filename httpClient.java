/*
 *  Koszalin 2004
 *  httpClient.java
 *  Przyklad prostego klienta protokolu http
 *  Dariusz Rataj (C)
 */

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class httpClient
{
 // pobranie domyslnego dokumentu w glownym katalogu serwera http (/) 
 // najczescie index.html
 String message = "GET / HTTP/1.1\r\n"+
         "Accept: */*\r\n" + // */
         "Connection: close\r\n"+
         "Referer: 192.168.66.5\r\n"+
         "User-Agent: Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; IDG.pl)\r\n"+
         "Host: 192.168.66.5\r\n"+
         "Content-Type: text/html\r\n"; 
         
 void getDocument()
 {
  Socket socket;
  BufferedReader in;
  String tekst = "", all = "";
  PrintWriter out = null;
  PrintWriter out2 = null; 
 
  ArrayList hostList= new ArrayList(4);
  String host = "google.com";
  String host2 = "wp.pl";
  String host3 = "onet.pl";
  String host4 = "tu.koszalin.pl";
  hostList.add(host);
  hostList.add(host2);
  hostList.add(host3);
  hostList.add(host4);
  int j;
  for(j=0;j<4;j++) {
	  host=hostList.toArray()[j].toString();
  try {
   socket = new Socket(host, 80);
   in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
   out = new PrintWriter(socket.getOutputStream(), true);
   BufferedWriter writer = new BufferedWriter(new FileWriter("httpClient.txt"));
   out.println(message);
   writer.append(message);
   System.out.println("---------------- Komunikat http wyslany --------------------");
   System.out.println("------------------ Odpowiedz serwera: ----------------------");

   while( (tekst=in.readLine()) !=null){
        System.out.println(tekst);
        writer.append(tekst);
        }
   in.close();        
   socket.close();  
   writer.close();
  }
  catch (UnknownHostException e) {
    System.err.println("Blad URL: sprawdz poprawnosc url");
   }
  catch (IOException e) {
    System.err.println("Blad I/O");
   }
   
  System.out.println("------------------- Koniec odpowiedzi ----------------------");
 }
 }
 public httpClient()  // konstruktor
 {
  getDocument();      
 }

 public static void main(String args[])
 {
  new httpClient(); // utworzenie obiektu klienta
 }
}
