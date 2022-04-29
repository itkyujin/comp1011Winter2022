package commit.comp1011.commit100;

import java.io.*;
import java.util.*;

public class Commit100 {
         // Java program to print common characters
         // of two Strings in alphabetical order
        static final int MAX_CHAR = 26;
        static void printCommon(String str1, String str2) {
            // two arrays of length 26 to store occurrence
            // of a letters alphabetically for each string
            int[] a1 = new int[MAX_CHAR];
            int[] a2 = new int[MAX_CHAR];

            int l1 = str1.length();
            int l2 = str2.length();

            for (int i = 0 ; i < l1 ; i++)
                a1[str1.charAt(i) - 'a'] += 1;

            for (int i = 0 ; i < l2 ; i++)
                a2[str2.charAt(i) - 'a'] += 1;

            // If a common index is non-zero, it means
            // that the letter corresponding to that
            // index is common to both strings
            for (int i = 0 ; i < MAX_CHAR ; i++)
            {
                if (a1[i] != 0 && a2[i] != 0)
                {
                    // Find the minimum of the occurrence
                    // of the character in both strings and print
                    // the letter that many number of times
                    for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
                        System.out.print(((char)(i + 'a')));
                }
            }
        }

        // Driver code
        public static void main(String[] args) throws IOException
        {
            String s1 = "thisisatest", s2 = "onceuponatime";
            printCommon(s1, s2);
        }
    }
