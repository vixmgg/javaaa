/*
 *  Koszalin 2004
 *  getAllAddresses.java
 *  Przyklad - pobranie z DNS wszystkich IP przypisanych do nazwy
 *  Dariusz Rataj (C)
 */

import java.net.*;

class getAllAddresses {

 public static void main (String[] args) {

  String host = "ibm.com";
  if (args.length > 0) host = args[0];
  
  try {
    System.out.println("Adresy przypisane do nazwy " + host + ":\n");
    InetAddress[] adresy = InetAddress.getAllByName(host);
    for (int i = 0; i < adresy.length; i++) {
       System.out.println(adresy[i]);
     }
  }
  catch (UnknownHostException ex) {
	    System.err.println("Nie moge znalezc hosta " + host + " :( !");
	  } // koniec catch
  String host2 = "java.sun.com";
  if (args.length > 0) host2 = args[0];
  
  try {
    System.out.println("Adresy przypisane do nazwy " + host2 + ":\n");
    InetAddress[] adresy = InetAddress.getAllByName(host2);
    for (int i = 0; i < adresy.length; i++) {
       System.out.println(adresy[i]);
     }
   }
  catch (UnknownHostException ex) {
	    System.err.println("Nie moge znalezc hosta " + host2 + " :( !");
	  } // koniec catch
  String host3 = "kos.man.koszalin.pl";
  if (args.length > 0) host3 = args[0];
  
  try {
    System.out.println("Adresy przypisane do nazwy " + host3 + ":\n");
    InetAddress[] adresy = InetAddress.getAllByName(host3);
    for (int i = 0; i < adresy.length; i++) {
       System.out.println(adresy[i]);
     }
  }
  catch (UnknownHostException ex) {
	    System.err.println("Nie moge znalezc hosta " + host3 + " :( !");
	  } // koniec catch
 }
  
  
}
