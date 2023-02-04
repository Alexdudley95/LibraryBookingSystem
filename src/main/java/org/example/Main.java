package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, BookObject> bookHash = new HashMap<Integer, BookObject>();
            startState(bookHash);
    }

    public static void startState(HashMap<Integer, BookObject> bookHash) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? Input New Book = I, Search Book = S, Exit = X");
        String scan = scanner.next();
        if (scan.equalsIgnoreCase("I")){
            System.out.println("Input Title: ");
            Scanner bookTitle = new Scanner(System.in);
            String titleInput = bookTitle.next();
            System.out.println("Input Author: ");
            Scanner bookAuthor = new Scanner(System.in);
            String authorInput = bookAuthor.next();
            System.out.println("Input Genre: ");
            Scanner bookGenre = new Scanner(System.in);
            String genreInput = bookGenre.next();
            //end of input
            BookObject newBook = BookIndex.pushBookInfo(bookHash, titleInput, authorInput, genreInput);
            bookHash.put(newBook.getIndexNumber(), newBook);
            Main.startState(bookHash);
        } else if(scan.equalsIgnoreCase("S")){
            Scanner searchScan = new Scanner(System.in);
            String scan3 = searchScan.next();

             if(scan3.equalsIgnoreCase("T")){
                 String output = BookIndex.indexNameLookUp(bookHash);
                 System.out.println(output);
              }else if (scan3.equalsIgnoreCase("N")){
                 String output = BookIndex.indexLookUp(bookHash);
                 System.out.println(output);
              }

            Main.startState(bookHash);
        }
        else if (scan.equalsIgnoreCase("X")) {
            System.out.println("Exiting...");
            System.exit(1);
        }


    }
}