import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
This program creates a list of songs for a CD
by reading from a file.
*/


/**
 * just an fyi there's more to this file just that code wasnt written by me 
 * decided to only upload the file with the code ive written! -emi
 *
 */

public class song
{
public static void main(String[] args)throws IOException
{
Scanner input = new Scanner(new File("Classics.txt"));
String title;
String artist;
// ADD LINES FOR LAB #3 HERE
// Declare an array of Song objects, called cd, // with
//a size of 6
Song[] cd = new Song[6];

for (int i = 0; i < cd.length; i++)
{
title = input.nextLine();
artist = input.nextLine();

cd[i] = new Song(title, artist);


// ADD LINES FOR LAB #3 HERE
// Fill the array by creating a new song with
// the title and artist and storing it in the
// appropriate position in the array
}
System.out.println("Contents of Classics:");
for (int i = 0; i < cd.length; i++)
{
System.out.print(cd[i]);
}
}
}