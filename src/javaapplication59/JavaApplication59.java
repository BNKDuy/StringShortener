/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

import java.util.*;

public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1 = 0, r1 = 0, u = 0, c = 0;
        String in, out1 = "", out2 = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Type the message to be shortened");
        in = input.nextLine().toLowerCase();
        System.out.println("\nAlgorithm 1");

        for (int i = 0; i < in.length(); i++)
        {
          if ((i == 0) || (i > 0 &&(in.substring(i - 1, i).equals(" "))) || (!(in.substring(i, i+ 1).equals("a") || in.substring(i, i + 1).equals("e") || in.substring(i, i + 1).equals("i") || in.substring(i, i + 1).equals("o") || in.substring(i, i + 1).equals("u"))) && (!(in.substring(i, i+1).equals(in.substring(i - 1, i)))))
          {
            out1 += in.substring(i, i + 1);
          }
          else
          {
            if (in.substring(i, i+ 1).equals("a") || in.substring(i, i + 1).equals("e") || in.substring(i, i + 1).equals("i") || in.substring(i, i + 1).equals("o") || in.substring(i, i + 1).equals("u"))
            {
              v1++;
            }
            else if (in.substring(i, i+1).equals(in.substring(i - 1, i)))
            {
              r1++;
            }
          }
        }

        System.out.println("Vowels removed: " + v1);
        System.out.println("Repeats removed: " + r1);
        System.out.println("Algorithm 1 message: " + out1);
        System.out.println("Algorithm 1 characters saved: " + (v1 + r1));

        System.out.println("\nAlgorithm 2");

        for (int i = 0; i < in.length(); i++)
        {
          if (!(in.substring(i,i+1).equals(" ")))
          {
            for (int t = 0; t < in.length(); t++)
            {
              if (in.substring(t, t+1).equals(in.substring(i, i+1)))
              {
                c++;
              }
            }
            u++;
            out2 += c;
            out2 += in.substring(i,i+1);
            c = 0;
            in = in.replaceAll((in.substring(i,i+1)), " ");
          }
        }
        System.out.println("Unique characters found: " + u);
        System.out.println("Algorithm 2 message: " + out2);
        System.out.println("Algorithm 2 characters saved: " + (in.length() - out2.length()));
    }
}
