// The challenge here is to read n lines of input until you reach EOF, then
// number and print all n lines of content.

// Hint: Java's Scanner.hasNext() method is helpful for this problem.

// Input Format
// Read some unknown n lines of input from stdin(System.in) until you reach EOF;
// each line of input contains a non-empty String.

// Output Format
// For each line, print the line number, followed by a single space, and then
// the line content received as input.

// Sample Input
// Hello world
// I am a file
// Read me until end-of-file.

// Sample Output
// 1 Hello world
// 2 I am a file
// 3 Read me until end-of-file.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int i = 0;
    public static String s = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            i += 1;
            s = scanner.nextLine();
            System.out.printf("%d %s%n", i, s);
        }
    }
}