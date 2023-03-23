/*
 *  Koszalin 2004
 *  dayTimeClient.java
 *  Przyklad prostego klienta daty i czasu
 *  Dariusz Rataj (C)
 */

import java.net.*;
import java.io.*;

public class dayTimeClient {

 public static void main(String[] args) {

  Socket socket;
  String host = "termit.ie.tu.koszalin.pl";
  BufferedReader in;

  if (args.length > 0) host = args[0];
    
  /*   tworzenie gniazda klienta, pobranie danych, wydruk informacji na konsoli */
  try {
    socket = new Socket(host, 80);
    socket.setSoTimeout(10);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String time = in.readLine();
    System.out.println("Host: " + host + " zwraca na porcie nr 80:");
    System.out.println("date i czas: " + time);
   } 
  catch (UnknownHostException e) {
    System.err.println(e);
   }
  catch (IOException e) {
    System.err.println(e);
   }
  
  Socket socket2;
  String host2 = "moskit.ie.tu.koszalin.pl";
  BufferedReader in2;

  if (args.length > 0) host2 = args[0];
    
  /*   tworzenie gniazda klienta, pobranie danych, wydruk informacji na konsoli */
  try {
    socket2 = new Socket(host2, 80);
    socket2.setSoTimeout(10);
    in = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
    String time2 = in.readLine();
    System.out.println("Host: " + host2 + " zwraca na porcie nr 80:");
    System.out.println("date i czas: " + time2);
   } 
  catch (UnknownHostException e) {
    System.err.println(e);
   }
  catch (IOException e) {
    System.err.println(e);
   }
  
  Socket socket3;
  String host3 = "puma.tu.koszalin.pl";
  BufferedReader in3;

  if (args.length > 0) host = args[0];
    
  /*   tworzenie gniazda klienta, pobranie danych, wydruk informacji na konsoli */
  try {
    socket3 = new Socket(host3, 80);
    socket3.setSoTimeout(10);
    in = new BufferedReader(new InputStreamReader(socket3.getInputStream()));
    String time3 = in.readLine();
    System.out.println("Host: " + host3 + " zwraca na porcie nr 80:");
    System.out.println("date i czas: " + time3);
   } 
  catch (UnknownHostException e) {
    System.err.println(e);
   }
  catch (IOException e) {
    System.err.println(e);
   }
  
  
  Socket socket4;
  String host4 = "kos.man.koszalin.pl";
  BufferedReader in4;

  if (args.length > 0) host4 = args[0];
    
  /*   tworzenie gniazda klienta, pobranie danych, wydruk informacji na konsoli */
  try {
    socket4 = new Socket(host4, 80);
    socket4.setSoTimeout(10);
    in = new BufferedReader(new InputStreamReader(socket4.getInputStream()));
    String time4 = in.readLine();
    System.out.println("Host: " + host4 + " zwraca na porcie nr 80:");
    System.out.println("date i czas: " + time4);
   } 
  catch (UnknownHostException e) {
    System.err.println(e);
   }
  catch (IOException e) {
    System.err.println(e);
   }
    
  
  
  
  
  
  
  
 }  // koniec main
} // koniec dayTimeClient


//moskit blad
//blad