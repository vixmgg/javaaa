/*
 *  Koszalin 2004
 *  demoInetAddress.java
 *  Przyklad demonstrujacy podstawowe zastosowania klasy InetAddress
 *  Dariusz Rataj (C)
 */
 
import java.net.*;

class demoInetAddress {

 public static void main (String[] args) {
  try {
   // pobranie danych lokalnego hosta
   InetAddress adres1 = InetAddress.getLocalHost();
   System.out.println("Nazwa lokalnego hosta: " + adres1.getHostName());
   System.out.println("Adres lokalnego hosta: " + adres1.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanej nazwie
   InetAddress adres2 = InetAddress.getByName("wbiis.tu.koszalin.pl");
   System.out.println("Nazwa: " + adres2.getHostName());
   System.out.println("Adres: " + adres2.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanym adresie IP
   InetAddress adres3 = InetAddress.getByName("192.168.55.20");
   System.out.println("Nazwa: " + adres3.getHostName());
   System.out.println("Adres: " + adres3.getHostAddress() + "\n");
   
   InetAddress adres33 = InetAddress.getLocalHost();
   System.out.println("Nazwa lokalnego hosta: " + adres3.getHostName());
   System.out.println("Adres lokalnego hosta: " + adres3.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanej nazwie
   InetAddress adres4 = InetAddress.getByName("puma.tu.koszalin.pl");
   System.out.println("Nazwa: " + adres2.getHostName());
   System.out.println("Adres: " + adres2.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanym adresie IP
   InetAddress adres5 = InetAddress.getByName("148.81.247.7");
   System.out.println("Nazwa: " + adres3.getHostName());
   System.out.println("Adres: " + adres3.getHostAddress() + "\n");
   
   
   InetAddress adres6 = InetAddress.getLocalHost();
   System.out.println("Nazwa lokalnego hosta: " + adres1.getHostName());
   System.out.println("Adres lokalnego hosta: " + adres1.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanej nazwie
   InetAddress adres7 = InetAddress.getByName("microsoft.com");
   System.out.println("Nazwa: " + adres7.getHostName());
   System.out.println("Adres: " + adres7.getHostAddress() + "\n");
   
   // pobranie danych hosta o znanym adresie IP
   InetAddress adres8 = InetAddress.getByName("153.19.134.114");
   System.out.println("Nazwa: " + adres8.getHostName());
   System.out.println("Adres: " + adres8.getHostAddress() + "\n");
  }
  catch (UnknownHostException e) {
    System.err.println(e);
   }
 } // koniec main
} // koniec demoInetAddress
 

//Nazwa lokalnego hosta: DESKTOP-T0VDSOD
//Adres lokalnego hosta: 192.168.56.1

//Nazwa: microsoft.com
//Adres: 20.84.181.62

