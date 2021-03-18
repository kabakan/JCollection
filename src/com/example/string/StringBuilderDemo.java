package com.example.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringBuilderDemo {
  public static void main(String[] args) throws FileNotFoundException, IOException {

    BufferedReader reader = new BufferedReader(new FileReader("./onegin.txt"));

    StringBuilder sb = new StringBuilder();
    String line = null;
    while ( (line = reader.readLine()) != null) {
      sb.append(line).append("\n");
    }
    reader.close();
    String[] words = sb.toString().split("\\s+");
    System.out.println("Total words:" + words.length);
    waitEnter();

    long ts = System.nanoTime();

    String buff = "";
    //2 StringBuffer buff = new StringBuffer();
    //3 StringBuilder buff = new StringBuilder();

    for (String word : words) {
      buff += word + " ";
      //2&3 buff.append(word).append(" ");
    }

    long te =System.nanoTime();

    System.out.println("Complete, lenght:" + buff.length() + " elapsed time:" + (te - ts)/1e6 + "ms");

  }

  private static void waitEnter() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Press Enter key.");
    scan.nextLine();
  }

}
