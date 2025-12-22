package org.apache.commons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculatrice calc = new Calculatrice();
      int  resultat1 = calc.multiplication(2,2);
      System.out.println(resultat1);
        int  resultat2 = calc.multiplication(3,2);
        System.out.println(resultat2);

    }
}
